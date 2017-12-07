package services


import init.ScattDBInit
import managers.DatabaseManager
import remote.operations._
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.duration._
import scala.concurrent.{Await, Awaitable, Future}

object QueryService {

  val keyStoreSelectPattern = "query\\[select[ ]+key\\(([A-Za-z0-9]+)\\)[ ]+from[ ]+([A-Za-z0-9]+)\\]"
  val keyStoreInsertPattern = "query\\[insert[ ]+key\\(([A-Za-z0-9]+)\\)[ ]+into[ ]+([A-Za-z0-9]+)[ ]+data\\(([^\\(\\)]+)\\)\\]"
  val entryStoreSelectPattern = "query\\[select[ ]+entry\\(([^\\(\\)]+)\\)[ ]+from[ ]+([A-Za-z0-9]+)\\]"
  val entryStoreInsertPattern = "query\\[insert[ ]+entry\\(([^\\(\\)]+)\\)[ ]+into[ ]+([A-Za-z0-9]+)\\]"

  implicit val _ = Timeout(5 seconds)

  def parseQuery(message: String): Future[Any] = {

    if (message.matches(keyStoreSelectPattern)) {
      getKeyValue(message)
    } else if (message.matches(keyStoreInsertPattern)) {
      putKeyValue(message)
    } else if (message.matches(entryStoreSelectPattern)) {
      getEntry(message)
    } else if (message.matches(entryStoreInsertPattern)) {
      putEntry(message)
    } else {
      Future.failed(new IllegalArgumentException("Invalid query."))
    }
  }

  def getKeyValue(message: String): Future[Any] = {

    val keyValue = keyStoreSelectPattern.r.findAllIn(message)
    val dataset = keyValue.group(2)
    val key = keyValue.group(1)
    ScattDBInit.remoteActor ? SelectKeyValue(dataset, key)
  }

  def putKeyValue(message: String): Future[Any] = {
    val keyValue = keyStoreInsertPattern.r.findAllIn(message)
    val dataset = keyValue.group(2)
    val key = keyValue.group(1)
    val value = keyValue.group(3)
    ScattDBInit.remoteActor ? InsertKeyValue(dataset, key, value)
  }

  def getEntry(message: String): Future[Any] = {
    val entryQuery = entryStoreSelectPattern.r.findAllIn(message)
    val dataset = entryQuery.group(2)
    // TODO: passing entry query param
    val entry = entryQuery.group(1)
    ScattDBInit.remoteActor ? SelectEntry(dataset)
  }

  def putEntry(message: String): Future[Any] = {
    val entryQuery = entryStoreInsertPattern.r.findAllIn(message)
    val dataset = entryQuery.group(2)
    val entry = entryQuery.group(1)
    ScattDBInit.remoteActor ? InsertEntry(dataset, entry)
  }

}
