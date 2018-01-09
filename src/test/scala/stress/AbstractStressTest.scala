package stress

import java.io.{BufferedReader, InputStreamReader, PrintWriter}
import java.net.{ConnectException, Socket}

import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

abstract class AbstractStressTest {
  val MAX_TIMEOUT = 3000

  def main(args: Array[String]) {

    implicit val ec = ExecutionContext.global

    val futures = List.empty[Future[Any]]

    val startTime = System.nanoTime()

    for (i <- 1 to 1000) {
      futures.:+(Future {
        try {
          val socket = new Socket("127.0.0.1", 7000)
          val reader = new BufferedReader(new InputStreamReader(socket.getInputStream))
          val printWriter = new PrintWriter(socket.getOutputStream, true)
          printWriter.println(getQueryPattern(i))
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
      case Success(_) => {
        val endTime = System.nanoTime()
        println("Stress test finished in " + (endTime - startTime) / 1000000 + "ms.")
      }
      case Failure(e) => {
        println(e)
      }
    })

    Thread.sleep(MAX_TIMEOUT)
  }

  def getQueryPattern(index: Integer): String
}
