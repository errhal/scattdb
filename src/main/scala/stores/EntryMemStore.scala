package stores

import java.util.Comparator
import java.util.concurrent.ConcurrentHashMap

import com.fasterxml.jackson.databind.JsonNode

import scala.collection.concurrent.TrieMap

object EntryMemStore {

  val entryDb = new TrieMap[String, scala.collection.concurrent.Map[String, JsonNode]]()

  private val putLock = new Object


  def putEntry(uuid: String, dataset: String, entry: JsonNode): Boolean = {
    putLock.synchronized {

      val datasetMap = entryDb.get(dataset).orElse(Option.apply(new TrieMap[String, JsonNode])).get
      datasetMap += uuid -> entry
      entryDb += dataset -> datasetMap
      true
    }
  }

  def getEntry(dataset: String): collection.concurrent.Map[String, JsonNode] = {
    putLock.synchronized {
      entryDb.get(dataset).orElse(Option.apply(new TrieMap[String, JsonNode]())).get
    }
  }

}