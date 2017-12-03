import java.net.ServerSocket

import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.Logger
import config.ConfigurationProvider
import listeners.SocketListener
import remote.master.LookupActor
import remote.slave.SelectorActor

object ScattDBInit {

  val logger = Logger(this.getClass)

  def main(args: Array[String]) {

    if(args.length > 1) {
      args(1) match {
        case "master/slave" | "0" => {
          startRemoteSlaveSystem
          startRemoteMasterSystem
        }
        case "master" | "1" => startRemoteMasterSystem
        case "slave" | "2" => startRemoteSlaveSystem
      }
    } else {
      ConfigurationProvider.getServerType() match {
        case 0 => {
          startRemoteSlaveSystem
          startRemoteMasterSystem
        }
        case 1 => startRemoteMasterSystem
        case 2 => startRemoteSlaveSystem
      }
    }

    val portNumber = ConfigurationProvider.getDefaultPort()
    val serverSocket = new ServerSocket(portNumber)

    SocketListener.init(serverSocket)
  }

  def startRemoteSlaveSystem = {
    val system = ActorSystem("SlaveSystem", ConfigFactory.load("slave"))
    system.actorOf(Props[SelectorActor], "selector")

    logger.debug("Started remote slave system.")
  }

  def startRemoteMasterSystem = {
    val system = ActorSystem("MasterSystem", ConfigFactory.load("master"))
    val remotePath = "akka.tcp://SlaveSystem@127.0.0.1:9001/user/selector"
    val actor = system.actorOf(Props(classOf[LookupActor], remotePath), "lookupActor")

    logger.debug("Started remote lookup system.")
  }

}
