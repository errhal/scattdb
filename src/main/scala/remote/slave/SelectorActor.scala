package remote.slave

import akka.actor.Actor
import com.typesafe.scalalogging.Logger
import managers.DatabaseManager
import remote.operations.Select

class SelectorActor extends Actor {

  val logger = Logger(classOf[SelectorActor])

  def receive = {
    case Select(dataset, key) => {
      logger.debug("Select key: {} from dataset: {}", key, dataset)
      sender() ! DatabaseManager.getKey(dataset, key)
    }
  }

}
