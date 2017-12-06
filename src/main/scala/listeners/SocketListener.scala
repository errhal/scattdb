package listeners

import java.io.{BufferedReader, InputStreamReader, PrintWriter}
import java.net.{ServerSocket, Socket}

import managers.DatabaseManager
import services.{AuthenticationService, QueryService}

import scala.concurrent.{Await, Awaitable, Future}
import scala.util.{Failure, Success}

object SocketListener {

  def init(serverSocket: ServerSocket): Unit = {

    DatabaseManager.initDbFiles()
    while (true) {
      val clientSocket = serverSocket.accept()
      val clientSocketOut = new PrintWriter(clientSocket.getOutputStream, true)
      val clientSocketIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream))

      val input = clientSocketIn.readLine()
      // recognize one message per line
      val future = recognizeMessageType(input, clientSocketOut)
      import scala.concurrent.ExecutionContext.Implicits.global
      future onComplete {
        case Success(result) => {
          clientSocketOut.println(result)
          clientSocketIn.close()
          clientSocket.close()
        }
        case Failure(t) => {
          clientSocketOut.println(t.getMessage)
          clientSocketIn.close()
          clientSocket.close()
        }
      }
    }
  }

  def recognizeMessageType(message: String, clientSocketOut: PrintWriter): Future[Any] = {

    message.split("\\[")(0) match {
//      TODO: change authentication to make async requests
//      case "authentication" => if (!AuthenticationService.authenticate(message)) {
//        clientSocketOut.println("Wrong account credentials! User not found")
//      } else {
//        clientSocketOut.println("User successfully logged in")
//      }
      case "query" => QueryService.parseQuery(message)
    }
  }

}
