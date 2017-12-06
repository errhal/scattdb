package remote.slave

import akka.actor.Actor
import akka.actor.Status.Failure
import com.typesafe.scalalogging.Logger
import managers.DatabaseManager
import remote.operations.{InsertKeyValue, InsertResult, SelectKeyValue, SelectResult}

class KeyValueActor extends Actor {

  val logger = Logger(classOf[KeyValueActor])

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
  }
}
