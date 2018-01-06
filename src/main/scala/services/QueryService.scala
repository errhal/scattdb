package services


import java.util.StringTokenizer

import akka.actor.ActorSelection
import remote.operations._
import akka.pattern.ask
import akka.util.Timeout
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{ANTLRInputStream, CharStream, CharStreams, CommonTokenStream}
import parser.impl.DefaultQueryListener
import parser.{QueryBaseListener, QueryLexer, QueryListener, QueryParser}
import tokens.Token

import scala.concurrent.duration._
import scala.concurrent.{Await, Awaitable, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.matching.Regex
import scala.collection.JavaConverters._
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object QueryService {

  var actorRefs = List.empty[ActorSelection]

  val entryStoreSelectPattern = "query\\[select[ ]+entry\\(([^\\(\\)]+)\\)[ ]+from[ ]+([A-Za-z0-9]+)\\]"
  val entryStoreInsertPattern = "query\\[insert[ ]+entry\\(([^\\(\\)]+)\\)[ ]+into[ ]+([A-Za-z0-9]+)\\]"

  implicit val _ = Timeout(5 seconds)

  def parseQuery(message: String): Future[Any] = {

    val lexer = new QueryLexer(CharStreams.fromString(message))
    val parser = new QueryParser(new CommonTokenStream(lexer))

    val tree = parser.queryStatement()
    val listener = new DefaultQueryListener
    ParseTreeWalker.DEFAULT.walk(listener, tree)


    if (listener.isSelect && listener.isKeyValue) {
      getKeyValue(listener.key, listener.dataset)
    } else if (listener.isInsert && listener.isKeyValue) {
      putKeyValue(listener.key, listener.dataset, listener.data)
    } else if (message.matches(entryStoreSelectPattern)) {
      getEntry(message)
    } else if (message.matches(entryStoreInsertPattern)) {
      putEntry(message)
    } else {
      Future.failed(new IllegalArgumentException("Invalid query."))
    }
  }

  def getKeyValue(key: String, dataset: String): Future[Any] = {

    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? SelectKeyValue(dataset, key))
    Future.sequence(futures)
  }

  def putKeyValue(key: String, dataset: String, data: String): Future[Any] = {
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? InsertKeyValue(dataset, key, data))
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
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? InsertEntry(generateUUID, dataset, entry))
    Future.sequence(futures)
  }

  def generateUUID: String = {
    java.util.UUID.randomUUID().toString.replaceAll("-", "")
  }

}
