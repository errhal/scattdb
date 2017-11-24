package stores

import java.util.concurrent.ConcurrentHashMap

import com.fasterxml.jackson.databind.JsonNode

object EntryMemStore {

  val entryDb = new ConcurrentHashMap[String, ConcurrentHashMap[Long, JsonNode]]()
  var index = 0

  private val putLock = new Object


  def putEntry(dataset: String, entry: JsonNode): Boolean = {
    putLock.synchronized {
      if (!entryDb.containsKey(dataset)) {
        entryDb.put(dataset, new ConcurrentHashMap[Long, JsonNode]())
      }

      val datasetMap = entryDb.get(dataset)
      datasetMap.put(index, entry)
      index += 1
      true
    }
  }

  def getEntry(dataset: String): ConcurrentHashMap[Long, JsonNode] = {
    putLock.synchronized {
      entryDb.get(dataset)
    }
  }

}
