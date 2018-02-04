package init

import java.net.ServerSocket

import akka.actor.{ActorSelection, ActorSystem, Props}
import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.Logger
import config.ConfigurationProvider
import listeners.SocketListener
import org.apache.log4j.BasicConfigurator
import remote.slave.DBActor
import services.QueryService

object ScattDBInit {

  val logger = Logger(this.getClass)

  def main(args: Array[String]) {

    BasicConfigurator.configure()

    if (args.length > 1) {
      args(1) match {
        case "master/slave" | "0" => {
          startLocalSlaveSystem
          startRemoteMasterSystem
        }
        case "master" | "1" => startRemoteMasterSystem
        case "slave" | "2" => startRemoteSlaveSystem
      }
    } else {
      ConfigurationProvider.getServerType() match {
        case 0 =>
          startLocalSlaveSystem
          startRemoteMasterSystem
        case 1 => startRemoteMasterSystem
        case 2 => startRemoteSlaveSystem
      }
    }
  }

  def startLocalSlaveSystem = {
    val system = ActorSystem("SlaveSystem")
    val actor = system.actorOf(Props[DBActor], "selector")
    QueryService.actorRefs = QueryService.actorRefs.:+(system.actorSelection(actor.path))
    logger.debug("Started local slave system.")
  }

  def startRemoteSlaveSystem = {
    val system = ActorSystem("SlaveSystem", ConfigFactory.load("slave"))
    system.actorOf(Props[DBActor], "selector")

    logger.debug("Started remote slave system.")
  }

  def startRemoteMasterSystem = {
    val system = ActorSystem("MasterSystem", ConfigFactory.load("master"))
    //    val actor = system.actorOf(Props(classOf[LookupActor], remotePath), "lookupActor")
    for (actorPath <- ConfigurationProvider.getHostsList()) {
      QueryService.actorRefs = QueryService.actorRefs.:+(system.actorSelection("akka.tcp://SlaveSystem@" + actorPath + "/user/selector"))
    }

    val portNumber = ConfigurationProvider.getDefaultPort()
    val serverSocket = new ServerSocket(portNumber)

    logger.debug("Started master node.")

    SocketListener.init(serverSocket)
  }

}
