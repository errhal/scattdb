package services

import akka.actor.ActorSelection
import remote.operations._
import akka.pattern.ask
import akka.util.Timeout
import com.fasterxml.jackson.databind.ObjectMapper
import managers.DatabaseManager
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import parser.impl.DefaultQueryVisitor
import parser.{QueryLexer, QueryParser}

import scala.collection.immutable.HashMap
import scala.concurrent.duration._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.collection.JavaConverters._

object QueryService {

  var actorRefs = List.empty[ActorSelection]
  val objectMapper = new ObjectMapper

  implicit val _ = Timeout(5 seconds)

  def parseMessage(message: Map[String, String]): DbResult = {

    val query = message("query")
    val lexer = new QueryLexer(CharStreams.fromString(query))
    val parser = new QueryParser(new CommonTokenStream(lexer))

    val tree = parser.queryStatement()
    val visitor = new DefaultQueryVisitor
    val result = visitor.visit(tree).asInstanceOf[Map[String, AnyRef]]

    val serializedResult = objectMapper.writeValueAsString(result.asJava)
    var resultMessage = ""

    if (visitor.isSelect && visitor.isKeyValue) {
      resultMessage = DatabaseManager.getKey(visitor.dataset, visitor.key)
      SelectKeyResult(resultMessage)
    } else if (visitor.isInsert && visitor.isKeyValue) {
      resultMessage = DatabaseManager.putKey(visitor.dataset, visitor.key, visitor.data)
      InsertKeyResult(resultMessage)
    } else if (visitor.isDelete && visitor.isKeyValue) {
      resultMessage = DatabaseManager.deleteKey(visitor.dataset, visitor.key)
      DeleteKeyResult(resultMessage)
    } else if (visitor.isSelect && visitor.isEntry && visitor.whereClause) {
      resultMessage = serializedResult
      SelectEntryResult(resultMessage)
    } else if (visitor.isSelect && visitor.isEntry) {
      // TODO: parsing entry query param
      resultMessage = DatabaseManager.getEntry(visitor.dataset)
      SelectEntryResult(resultMessage)
    } else if (visitor.isInsert && visitor.isEntry) {
      if (!message.contains("uuid")) {
        throw new IllegalArgumentException("Message does not contain uuid.")
      }
      val uuid = message("uuid")
      resultMessage = DatabaseManager.putEntry(uuid, visitor.dataset, visitor.entry).toString
      InsertEntryResult(resultMessage)
    } else if (visitor.isDelete && visitor.isEntry) {
      resultMessage = DatabaseManager.deleteEntry(visitor.dataset)
      DeleteEntryResult(resultMessage)
    } else {
      throw new IllegalArgumentException("Invalid query")
    }
  }

  def generateUUID: String = {
    java.util.UUID.randomUUID().toString.replaceAll("-", "")
  }

  def scatterQuery(deserializedClientMessage: Map[String, String]): Future[Any] = {

    if (!deserializedClientMessage.contains("query")) {
      throw new IllegalArgumentException("Message does not contain query.")
    }

    val query = deserializedClientMessage("query")

    val lexer = new QueryLexer(CharStreams.fromString(query))
    val parser = new QueryParser(new CommonTokenStream(lexer))

    val tree = parser.queryStatement()
    val visitor = new DefaultQueryVisitor
    visitor.visit(tree)

    var message = new HashMap[String, String]

    if (visitor.isInsert && visitor.isEntry) {
      val uuid = generateUUID
      message += "uuid" -> uuid
    }

    message += "query" -> query
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? MessageQueryWrapper(message))
    Future.sequence(futures)
  }
}
