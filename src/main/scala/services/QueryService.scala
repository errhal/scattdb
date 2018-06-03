package services

import akka.actor.ActorSelection
import remote.operations._
import akka.pattern.ask
import akka.util.Timeout
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import parser.impl.DefaultQueryVisitor
import parser.{QueryLexer, QueryParser}

import scala.concurrent.duration._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object QueryService {

  var actorRefs = List.empty[ActorSelection]

  implicit val _ = Timeout(5 seconds)

  def parseQuery(message: String): Future[Any] = {

    val lexer = new QueryLexer(CharStreams.fromString(message))
    val parser = new QueryParser(new CommonTokenStream(lexer))

    val tree = parser.queryStatement()
    val visitor = new DefaultQueryVisitor
    val result = visitor.visit(tree)
    if (visitor.isSelect && visitor.isKeyValue) {
      getKeyValue(visitor.key, visitor.dataset)
    } else if (visitor.isInsert && visitor.isKeyValue) {
      putKeyValue(visitor.key, visitor.dataset, visitor.data)
    } else if (visitor.isDelete && visitor.isKeyValue) {
      deleteKeyValue(visitor.key, visitor.dataset)
    } else if (visitor.isSelect && visitor.isEntry && visitor.whereClause) {
      getEntryWhereClause(message)
    } else if (visitor.isSelect && visitor.isEntry) {
      // TODO: parsing entry query param
      getEntry(visitor.dataset)
    } else if (visitor.isInsert && visitor.isEntry) {
      putEntry(visitor.dataset, visitor.entry)
    } else if (visitor.isDelete && visitor.isEntry) {
      deleteEntry(visitor.dataset)
    } else {
      Future.failed(new IllegalArgumentException("Invalid query."))
    }
  }

  def getKeyValue(key: String, dataset: String): Future[Any] = {

    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? SelectKeyValue(dataset, key))
    //    for (actorRef <- actorRefs) futures = futures.+:(Future {1})
    Future.sequence(futures)
  }

  def putKeyValue(key: String, dataset: String, data: String): Future[Any] = {
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? InsertKeyValue(dataset, key, data))
    Future.sequence(futures)
  }

  def deleteKeyValue(key: String, dataset: String): Future[Any] = {
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? DeleteKeyValue(dataset, key))
    Future.sequence(futures)
  }

  def getEntry(dataset: String): Future[Any] = {
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? SelectEntry(dataset))
    Future.sequence(futures)
  }

  def getEntryWhereClause(message: String): Future[Any] = {
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? SelectEntryWithWhere(message))
    Future.sequence(futures)
  }

  def putEntry(dataset: String, entry: String): Future[Any] = {
    var futures = List.empty[Future[Any]]
    val dataUuid = generateUUID
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? InsertEntry(dataUuid, dataset, entry))
    Future.sequence(futures)
  }

  def deleteEntry(dataset: String): Future[Any] = {
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? DeleteEntry(dataset))
    Future.sequence(futures)
  }

  def generateUUID: String = {
    java.util.UUID.randomUUID().toString.replaceAll("-", "")
  }

}
