package services


import akka.actor.ActorSelection
import remote.operations._
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.duration._
import scala.concurrent.{Await, Awaitable, Future}

import scala.concurrent.ExecutionContext.Implicits.global

object QueryService {

  var actorRefs = List.empty[ActorSelection]

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
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? SelectKeyValue(dataset, key))
    Future.sequence(futures)
  }

  def putKeyValue(message: String): Future[Any] = {
    val keyValue = keyStoreInsertPattern.r.findAllIn(message)
    val dataset = keyValue.group(2)
    val key = keyValue.group(1)
    val value = keyValue.group(3)
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? InsertKeyValue(dataset, key, value))
    Future.sequence(futures)
  }

  def getEntry(message: String): Future[Any] = {
    val entryQuery = entryStoreSelectPattern.r.findAllIn(message)
    val dataset = entryQuery.group(2)
    // TODO: passing entry query param
    val entry = entryQuery.group(1)
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? SelectEntry(dataset))
    Future.sequence(futures)
  }

  def putEntry(message: String): Future[Any] = {
    val entryQuery = entryStoreInsertPattern.r.findAllIn(message)
    val dataset = entryQuery.group(2)
    val entry = entryQuery.group(1)
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? InsertEntry(dataset, entry))
    Future.sequence(futures)
  }

}
