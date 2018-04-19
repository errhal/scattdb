package client

import java.io.{BufferedReader, InputStreamReader, PrintWriter}
import java.net.{ConnectException, Socket}

object Client {

  val defaultPortNumber = 7000
  val defaultIPNumber = "127.0.0.1"

  def main(args: Array[String]) {

    println("Welcome to the ScattDB console.")
    if (args.length != 2) {
      println("""Usage: scala Client [IP] [port]
Defaults:
    IP number: 127.0.0.1
    port number: 7000""")
    }

    val ip = if (args.length > 0) args(1) else defaultIPNumber
    val port = if (args.length > 1) args(2).toInt else defaultPortNumber

    while (true) {
      val query = scala.io.StdIn.readLine(">")
      try {
        val socket = new Socket(ip, port)
        val reader = new BufferedReader(new InputStreamReader(socket.getInputStream))
        val printWriter = new PrintWriter(socket.getOutputStream, true)
        printWriter.println(query)
        println(reader.readLine())
      } catch {
        case _: ConnectException =>
          println("Cannot establish a database connection.")
      }
    }
  }
}
