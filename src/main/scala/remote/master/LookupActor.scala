package remote.master

import scala.concurrent.duration._
import akka.actor.{Actor, ActorIdentity, ActorRef, Identify, ReceiveTimeout, Terminated}
import com.typesafe.scalalogging.Logger
import remote.operations.{DbOp, DbResult, Select, SelectResult}

class LookupActor(path: String) extends Actor {

  val logger = Logger(classOf[LookupActor])

  sendIdentifyRequest()

  def sendIdentifyRequest(): Unit = {
    context.actorSelection(path) ! Identify(path)
    import context.dispatcher
    context.system.scheduler.scheduleOnce(3.seconds, self, ReceiveTimeout)
  }

  override def receive: Receive = identifying

  def identifying: Actor.Receive = {
    case ActorIdentity(`path`, Some(actor)) =>
      context.watch(actor)
      context.become(active(actor))
    case ActorIdentity(`path`, None) => println(s"Remote actor not available: $path")
    case ReceiveTimeout => sendIdentifyRequest()
    case _ => println("Not ready yet")
  }

  def active(actor: ActorRef): Actor.Receive = {
    case op: DbOp => actor ! op
    case dbResult: DbResult => dbResult match {
      case SelectResult(result) =>
        logger.debug("Select result:\n{}", result.toString)
    }
    case Terminated(`actor`) =>
      println("Calculator terminated")
      sendIdentifyRequest()
      context.become(identifying)
    case ReceiveTimeout =>
    // ignore

  }
}
