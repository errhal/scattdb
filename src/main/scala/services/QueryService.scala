package services

import java.util.concurrent.TimeoutException

import init.ScattDBInit
import managers.DatabaseManager
import remote.operations.{DbResult, Select, SelectResult}
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.duration._
import scala.concurrent.{Await, Awaitable, Future}
import scala.util.Try


object QueryService {

  val keyStoreSelectPattern = "query\\[select[ ]+key\\(([A-Za-z0-9]+)\\)[ ]+from[ ]+([A-Za-z0-9]+)\\]"
  val keyStoreInsertPattern = "query\\[insert[ ]+key\\(([A-Za-z0-9]+)\\)[ ]+into[ ]+([A-Za-z0-9]+)[ ]+data\\(([^\\(\\)]+)\\)\\]"
  val entryStoreSelectPattern = "query\\[select[ ]+entry\\(([^\\(\\)]+)\\)[ ]+from[ ]+([A-Za-z0-9]+)\\]"
  val entryStoreInsertPattern = "query\\[insert[ ]+entry\\(([^\\(\\)]+)\\)[ ]+into[ ]+([A-Za-z0-9]+)\\]"

  def parseQuery(message: String): Future[Any] = {

    if (message.matches(keyStoreSelectPattern)) {
      getKeyValue(message)
    } else {
      Future.failed(new IllegalArgumentException("Invalid query."))
    }
//    TODO: Change db operations to make async req
//    else if (message.matches(keyStoreInsertPattern)) {
//      if (putKeyValue(message)) {
//        "Successfully inserted one key."
//      } else {
//        "Failed to insert specified key."
//      }
//    } else if (message.matches(entryStoreSelectPattern)) {
//      try {
//        getEntry(message)
//      } catch {
//        case e: IllegalArgumentException => e.getMessage
//      }
//    } else if (message.matches(entryStoreInsertPattern)) {
//      if (putEntry(message)) {
//        "Successfully inserted one entry."
//      } else {
//        "Failed to insert specified key."
//      }
//    } else {
//      "Invalid query."
//    }
  }

  def getKeyValue(message: String): Future[Any] = {

    val keyValue = keyStoreSelectPattern.r.findAllIn(message)
    val dataset = keyValue.group(2)
    val key = keyValue.group(1)
    implicit val timeout = Timeout(5 seconds)
    ScattDBInit.remoteActor ? Select(dataset, key)
  }

  def putKeyValue(message: String): Boolean = {
    val keyValue = keyStoreInsertPattern.r.findAllIn(message)
    val dataset = keyValue.group(2)
    val key = keyValue.group(1)
    val value = keyValue.group(3)
    DatabaseManager.putKey(dataset, key, value)
  }

  def getEntry(message: String): String = {
    val entryQuery = entryStoreSelectPattern.r.findAllIn(message)
    val dataset = entryQuery.group(2)
    // TODO: passing entry query param
    val entry = entryQuery.group(1)
    DatabaseManager.getEntry(dataset)
  }

  def putEntry(message: String): Boolean = {
    val entryQuery = entryStoreInsertPattern.r.findAllIn(message)
    val dataset = entryQuery.group(2)
    val entry = entryQuery.group(1)
    DatabaseManager.putEntry(dataset, entry)
    true
  }

}
