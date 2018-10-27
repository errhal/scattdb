package akka.remote.slave

import akka.actor.{ActorSystem, Props}
import akka.testkit.{ImplicitSender, TestActors, TestKit}
import com.fasterxml.jackson.databind.ObjectMapper
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}
import remote.operations.{InsertEntryResult, MessageQueryWrapper, SelectEntryResult}
import remote.slave.DBActor
import scala.collection.JavaConverters._

class DBActorInsertEntryTest extends TestKit(ActorSystem("DBActorTest")) with ImplicitSender
  with WordSpecLike with Matchers with BeforeAndAfterAll {

  val objectMapper = new ObjectMapper


  override def afterAll {
    TestKit.shutdownActorSystem(system)
  }

  "A DBActor" must {

    "correctly insert entry data" in {
      val dbActor = system.actorOf(Props[DBActor])
      val insertEntry = Map("query" -> "insert entry({\"basic\":\"example\"}) into db1",
        "uuid" -> "fake_uuid")

      dbActor ! MessageQueryWrapper(insertEntry)
      expectMsg(InsertEntryResult(true.toString))


      val selectEntry = Map("query" -> "select entry(key1) from db1")
      val expectedResponse = Map("fake_uuid" -> Map("basic" -> "example").asJava).asJava
      val expectedSelectResponse = SelectEntryResult(objectMapper.writeValueAsString(expectedResponse))
      dbActor ! MessageQueryWrapper(selectEntry)
      expectMsg(expectedSelectResponse)

    }

  }
}
