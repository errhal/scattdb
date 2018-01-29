package services

import akka.actor.ActorSelection
import remote.operations._
import akka.pattern.ask
import akka.util.Timeout
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}
import parser.impl.DefaultQueryListener
import parser.{QueryLexer, QueryParser}

import scala.concurrent.duration._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object QueryService {

  var actorRefs = List.empty[ActorSelection]

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
    } else if (listener.isSelect && listener.isEntry) {
      // TODO: parsing entry query param
      getEntry(listener.dataset)
    } else if (listener.isInsert && listener.isEntry) {
      putEntry(listener.dataset, listener.entry)
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

  def getEntry(dataset: String): Future[Any] = {
    var futures = List.empty[Future[Any]]
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? SelectEntry(dataset))
    Future.sequence(futures)
  }

  def putEntry(dataset: String, entry: String): Future[Any] = {
    var futures = List.empty[Future[Any]]
    val dataUuid = generateUUID
    for (actorRef <- actorRefs) futures = futures.+:(actorRef ? InsertEntry(dataUuid, dataset, entry))
    Future.sequence(futures)
  }

  def generateUUID: String = {
    java.util.UUID.randomUUID().toString.replaceAll("-", "")
  }

}
