package remote.slave

import akka.actor.Actor
import akka.actor.Status.Failure
import com.fasterxml.jackson.databind.ObjectMapper
import com.typesafe.scalalogging.Logger
import managers.DatabaseManager
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import parser.{QueryLexer, QueryParser}
import parser.impl.DefaultQueryVisitor
import remote.operations._

import scala.collection.JavaConverters._

class DBActor extends Actor {

  val logger = Logger(classOf[DBActor])
  val objectMapper = new ObjectMapper

  def receive = {
    case SelectKeyValue(dataset, key) =>
      try {
        sender() ! SelectKeyResult(DatabaseManager.getKey(dataset, key))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    case InsertKeyValue(dataset, key, value) =>
      try {
        sender() ! InsertKeyResult(DatabaseManager.putKey(dataset, key, value))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    case DeleteKeyValue(dataset, key) =>
      try {
        sender() ! DeleteEntryResult(DatabaseManager.deleteKey(dataset, key))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    case SelectEntry(dataset) =>
      try {
        sender() ! SelectEntryResult(DatabaseManager.getEntry(dataset))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    case SelectEntryWithWhere(message) =>
      try {
        val lexer = new QueryLexer(CharStreams.fromString(message))
        val parser = new QueryParser(new CommonTokenStream(lexer))

        val tree = parser.queryStatement()
        val defaultQueryVisitor = new DefaultQueryVisitor
        val result = defaultQueryVisitor.visitQueryStatement(tree).asInstanceOf[Map[String, Boolean]]
        val queriedData = defaultQueryVisitor.queriedData
        val filteredResult = queriedData.filter(d => result(d._1))
        sender() ! SelectEntryResult(
          objectMapper.writeValueAsString(filteredResult.asInstanceOf[Map[String, AnyRef]].asJava))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    case InsertEntry(uuid, dataset, entry) =>
      try {
        sender ! InsertEntryResult(DatabaseManager.putEntry(uuid, dataset, entry))
      } catch {
        case e: Exception => sender ! Failure(e)
      }
    case DeleteEntry(dataset) =>
      try {
        sender ! DeleteEntryResult(DatabaseManager.deleteEntry(dataset))
      }
  }
}
