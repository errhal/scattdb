package stores

import java.util.Comparator
import java.util.concurrent.ConcurrentHashMap

import com.fasterxml.jackson.databind.JsonNode

import scala.collection.concurrent.TrieMap

object EntryMemStore {

  val entryDb = new TrieMap[String, scala.collection.concurrent.Map[Long, JsonNode]]()

  private val putLock = new Object


  def putEntry(dataset: String, entry: JsonNode): Boolean = {
    putLock.synchronized {

      val datasetMap = entryDb.get(dataset).orElse(Option.apply(new TrieMap[Long, JsonNode])).get
      val index = (datasetMap.keySet + 0).max
      datasetMap += index + 1 -> entry
      entryDb += dataset -> datasetMap
      true
    }
  }

  def getEntry(dataset: String): collection.concurrent.Map[Long, JsonNode] = {
    putLock.synchronized {
      entryDb.get(dataset).orElse(Option.apply(new TrieMap[Long, JsonNode]())).get
    }
  }

}