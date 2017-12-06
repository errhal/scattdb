package remote.slave

import akka.actor.Actor
import akka.actor.Status.Failure
import com.typesafe.scalalogging.Logger
import managers.DatabaseManager
import remote.operations.{Select, SelectResult}

class KeyValueActor extends Actor {

  val logger = Logger(classOf[KeyValueActor])

  def receive = {
    case Select(dataset, key) => {
      try {
        sender() ! SelectResult(DatabaseManager.getKey(dataset, key))
      } catch {
        case e: Exception => sender() ! Failure(e)
      }
    }
  }
}
