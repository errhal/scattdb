package listeners

import java.io.{BufferedReader, InputStreamReader, PrintWriter}
import java.net.ServerSocket

import com.fasterxml.jackson.databind.{JsonNode, ObjectMapper}
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import managers.DatabaseManager
import remote.operations.{InsertEntryResult, SelectEntryResult}
import services.QueryService

import scala.collection.concurrent.TrieMap
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

import ExecutionContext.Implicits.global

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
        val future = recognizeMessageType(input, clientSocketOut)
        import scala.concurrent.ExecutionContext.Implicits.global
        future onComplete {
          case Success(result) =>
            clientSocketOut.println(recognizeResponseType(result))
            clientSocketIn.close()
            clientSocket.close()
          case Failure(t) =>
            clientSocketOut.println(t.getMessage)
            clientSocketIn.close()
            clientSocket.close()
        }
      }
    }
  }

  def recognizeMessageType(message: String, clientSocketOut: PrintWriter): Future[Any] = {

    import ExecutionContext.Implicits.global
    if (message == null || message.split("\\[")(0) == null) {
      return Future {}
    }
    message.split("\\[")(0).toLowerCase match {
      //      TODO: change authentication to make async requests
      //      case "authentication" => if (!AuthenticationService.authenticate(message)) {
      //        clientSocketOut.println("Wrong account credentials! User not found")
      //      } else {
      //        clientSocketOut.println("User successfully logged in")
      //      }
      case "query" => QueryService.parseQuery(message)
    }
  }

  def recognizeResponseType(result: Any) = result match {
    case l: List[_] if l.nonEmpty => l.head match {
      case s: SelectEntryResult => {
        var result = new TrieMap[String, JsonNode]
        for (slaveResult <- l) {
          val deserializedEntry = objectMapper.readValue(slaveResult.asInstanceOf[SelectEntryResult].result, classOf[Map[String, JsonNode]])
          result ++= deserializedEntry
        }
        objectMapper.writeValueAsString(result)
      }
      case i: InsertEntryResult => i.result
      case _ => "Malformed response from node."
    }
    case _ => "Received unsupported message"
  }
}
