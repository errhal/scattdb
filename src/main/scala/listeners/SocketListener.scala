package listeners

import java.io.{BufferedReader, InputStreamReader}
import java.net.{ServerSocket, Socket}

import services.AuthenticationService

object SocketListener {

  def init(serverSocket: ServerSocket): Unit = {

    var input = ""
    while(true) {
      val clientSocket = serverSocket.accept()
      val bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream))

      while ({input = bufferedReader.readLine(); input != null}) {

        input = bufferedReader.readLine()
      }
    }
  }

  def recognizeMessageType(message: String): Unit = {

    message.split("[")(0) match {
      case "authentication" => AuthenticationService.authenticate(message)

    }
  }

}
