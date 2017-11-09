package listeners

import java.io.{BufferedReader, InputStreamReader, PrintWriter}
import java.net.{ServerSocket, Socket}

import services.{AuthenticationService, QueryService}

object SocketListener {

  def init(serverSocket: ServerSocket): Unit = {

    while (true) {
      val clientSocket = serverSocket.accept()
      val clientSocketOut = new PrintWriter(clientSocket.getOutputStream, true)
      val clientSocketIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream))

      val input = clientSocketIn.readLine()
      // recognize one message per line
      recognizeMessageType(input, clientSocketOut)
      clientSocket.close()
    }
  }

  def recognizeMessageType(message: String, clientSocketOut: PrintWriter): Unit = {

    message.split("\\[")(0) match {
      case "authentication" => if (!AuthenticationService.authenticate(message)) {
        clientSocketOut.println("Wrong account credentials! User not found")
      } else {
        clientSocketOut.println("User successfully logged in")
      }
      case "query" => clientSocketOut.println(QueryService.parseQuery(message))
    }
  }

}
