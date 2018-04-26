package listeners

import java.io._
import java.net.{ServerSocket, Socket}

import com.fasterxml.jackson.databind.{JsonNode, ObjectMapper}
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import enums.SocketMessageType
import enums.SocketMessageType.SocketMessageType
import managers.DatabaseManager
import remote.operations._
import services.QueryService

import scala.collection.concurrent.TrieMap
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global


object SocketListener {

  val objectMapper = new ObjectMapper()
  objectMapper.registerModule(DefaultScalaModule)

  def init(serverSocket: ServerSocket): Unit = {

    DatabaseManager.initDbFiles()
    while (true) {
      val clientSocket = serverSocket.accept()
      Future {
        val clientSocketOut = new PrintWriter(clientSocket.getOutputStream, true)
        val clientSocketIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream))

        val input = clientSocketIn.readLine()
        // recognize one message per line
        val socketMessageType = recognizeMessageType(input, clientSocketOut)
        if (socketMessageType == SocketMessageType.INVALID) {
          sendMessageCloseSocket(clientSocket, clientSocketIn, clientSocketOut, "Invalid socket message format")
        } else if (socketMessageType == SocketMessageType.QUERY) {
          val responseFuture = QueryService.parseQuery(input)
          responseFuture onComplete {
            case Success(result) =>
              sendMessageCloseSocket(clientSocket, clientSocketIn, clientSocketOut, recognizeResponseType(result))
            case Failure(t) =>
              clientSocketOut.println(t.getMessage)
              clientSocketIn.close()
              clientSocket.close()
          }
        }
      }
    }
  }

  def sendMessageCloseSocket(clientSocket: Socket, clientSocketIn: Reader, clientSocketOut: PrintWriter, msg: Any) = {
    clientSocketOut.println(msg)
    clientSocketIn.close()
    clientSocket.close()
  }

  def recognizeMessageType(message: String, clientSocketOut: PrintWriter): SocketMessageType = {

    import ExecutionContext.Implicits.global
    if (message == null || message.split("\\[")(0) == null) {
      return SocketMessageType.INVALID
    }
    message.split("\\[")(0).toLowerCase match {
      //      TODO: change authentication to make async requests
      //      case "authentication" => if (!AuthenticationService.authenticate(message)) {
      //        clientSocketOut.println("Wrong account credentials! User not found")
      //      } else {
      //        clientSocketOut.println("User successfully logged in")
      //      }
      case "query" => SocketMessageType.QUERY
      case _ => SocketMessageType.INVALID
    }
  }

  def recognizeResponseType(result: Any) = result match {
    case l: List[_] if l.nonEmpty => l.head match {
      case s: SelectKeyResult => s
      case i: InsertKeyResult => i
      case d: DeleteKeyResult => d
      case s: SelectEntryResult =>
        var result = new TrieMap[String, JsonNode]
        for (slaveResult <- l) {
          val deserializedEntry = objectMapper.readValue(slaveResult.asInstanceOf[SelectEntryResult].result, classOf[Map[String, JsonNode]])
          result ++= deserializedEntry
        }
        objectMapper.writeValueAsString(result)
      case i: InsertEntryResult => i
      case d: DeleteEntryResult => d
      case _ => "Malformed response from node."
    }
    case _ => "Received unsupported message"
  }
}
