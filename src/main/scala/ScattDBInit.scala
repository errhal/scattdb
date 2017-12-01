import java.net.ServerSocket

import config.ConfigurationProvider
import listeners.SocketListener

object ScattDBInit {

  def main(args: Array[String]) {

    val portNumber = ConfigurationProvider.getDefaultPort()
    val serverSocket = new ServerSocket(portNumber)

    SocketListener.init(serverSocket)
  }

}
