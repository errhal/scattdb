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
import services.QueryService

import scala.collection.JavaConverters._

class DBActor extends Actor {

  val logger = Logger(classOf[DBActor])
  val objectMapper = new ObjectMapper

  def receive = {
    case MessageQueryWrapper(query) =>
      try {
        sender ! QueryService.parseMessage(query)
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    case _ =>
      sender ! s"Wrong message for ${classOf[DBActor].getSimpleName}."
  }
}
