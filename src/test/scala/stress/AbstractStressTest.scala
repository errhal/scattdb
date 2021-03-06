package stress

import java.io.{BufferedReader, InputStreamReader, PrintWriter}
import java.net.{ConnectException, Socket}

import client.Client.objectMapper
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule

import scala.concurrent.{Await, ExecutionContext, Future}
import scala.io.StdIn
import scala.util.{Failure, Success}
import scala.concurrent.duration._

abstract class AbstractStressTest {
  var requestNumber = 100000

  val objectMapper = new ObjectMapper()
  objectMapper.registerModule(DefaultScalaModule)

  def main(args: Array[String]) {

    implicit val ec = ExecutionContext.global
    var isCompleted = false

    if (args.length == 1) {
      requestNumber = args(0).toInt
    } else if (args.length == 2) {
      requestNumber = args(0).toInt
    }

    val futures = List.empty[Future[Any]]
    var message = Map("messageType" -> "query")

    val startTime = System.nanoTime()

    for (i <- 1 to requestNumber) {
      futures.:+(Future {
        try {
          val socket = new Socket("127.0.0.1", 7000)
          val reader = new BufferedReader(new InputStreamReader(socket.getInputStream))
          val printWriter = new PrintWriter(socket.getOutputStream, true)

          message += ("query" -> getQueryPattern(i))
          printWriter.println(objectMapper.writeValueAsString(message))
          var r = reader.readLine()
          while (r != null) {
            r = reader.readLine()
          }
        } catch {
          case _: ConnectException => {
            println("Socket is not opened.")
          }
        }
      })
    }

    val seqFutures = Future.sequence(futures)
    seqFutures.onComplete({
      case Success(_) =>
        val endTime = System.nanoTime()
        println("Stress test finished in " + (endTime - startTime) / 1000000 + " ms.")
        println("Req/s: " + (requestNumber.asInstanceOf[Double] * 1000000000 / (endTime - startTime)))
        println("Average request time: " + (endTime - startTime) / requestNumber.asInstanceOf[Double] / 1000000 + " ms.")
        isCompleted = true
      case Failure(e) =>
        println(e)
    })

    while (!isCompleted) {
      Thread.sleep(1000)
    }
  }

  def getQueryPattern(index: Integer): String
}
