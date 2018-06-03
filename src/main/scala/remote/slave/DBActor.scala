package remote.slave

import akka.actor.Actor
import akka.actor.Status.Failure
import com.typesafe.scalalogging.Logger
import managers.DatabaseManager
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import parser.{QueryLexer, QueryParser}
import parser.impl.DefaultQueryVisitor
import remote.operations._
import scala.collection.JavaConverters._

class DBActor extends Actor {

  val logger = Logger(classOf[DBActor])

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
        val result = defaultQueryVisitor.visitQueryStatement(tree)
        sender() ! SelectEntryResult(result.asInstanceOf[Map[String, AnyRef]].asJava.toString)
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
