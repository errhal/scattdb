package remote.slave

import akka.actor.Actor
import akka.actor.Status.Failure
import com.typesafe.scalalogging.Logger
import managers.DatabaseManager
import remote.operations._

class DBActor extends Actor {

  val logger = Logger(classOf[DBActor])

  def receive = {
    case SelectKeyValue(dataset, key) => {
      try {
        sender() ! SelectResult(DatabaseManager.getKey(dataset, key))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    }
    case InsertKeyValue(dataset, key, value) => {
      try {
        sender() ! InsertResult(DatabaseManager.putKey(dataset, key, value))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    }
    case SelectEntry(dataset) => {
      try {
        sender() ! SelectResult(DatabaseManager.getEntry(dataset))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    }
    case InsertEntry(dataset, entry) => {
      try {
        sender ! InsertResult(DatabaseManager.putEntry(dataset, entry))
      } catch {
        case e: Exception => sender ! Failure(e)
      }
    }
  }
}
