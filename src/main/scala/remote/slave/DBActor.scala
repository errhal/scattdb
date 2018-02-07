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
        sender() ! SelectEntryResult(DatabaseManager.getKey(dataset, key))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    }
    case InsertKeyValue(dataset, key, value) => {
      try {
        sender() ! InsertEntryResult(DatabaseManager.putKey(dataset, key, value))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    }
    case DeleteKeyValue(dataset, key) =>
      try {
        sender() ! DeleteEntryResult(DatabaseManager.deleteKey(dataset, key))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    case SelectEntry(dataset) => {
      try {
        sender() ! SelectEntryResult(DatabaseManager.getEntry(dataset))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    }
    case InsertEntry(uuid, dataset, entry) => {
      try {
        sender ! InsertEntryResult(DatabaseManager.putEntry(uuid, dataset, entry))
      } catch {
        case e: Exception => sender ! Failure(e)
      }
    }
  }
}
