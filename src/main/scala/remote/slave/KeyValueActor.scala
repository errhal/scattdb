package remote.slave

import akka.actor.Actor
import com.typesafe.scalalogging.Logger
import managers.DatabaseManager
import remote.operations.{Select, SelectResult}

class KeyValueActor extends Actor {

  val logger = Logger(classOf[KeyValueActor])

  def receive = {
    case Select(dataset, key) => {
      sender() ! SelectResult(DatabaseManager.getKey(dataset, key))
      print("Select key: {} from dataset: {}", key, dataset)

    }
  }
}
