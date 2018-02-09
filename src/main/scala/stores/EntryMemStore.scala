package stores

import com.fasterxml.jackson.databind.JsonNode

import scala.collection.concurrent.TrieMap

object EntryMemStore {

  val entryDb = new TrieMap[String, scala.collection.concurrent.Map[String, JsonNode]]()

  def putEntry(uuid: String, dataset: String, entry: JsonNode): Boolean = {
    val datasetMap = entryDb.get(dataset).orElse(Option.apply(new TrieMap[String, JsonNode])).get
    datasetMap += uuid -> entry
    entryDb += dataset -> datasetMap
    true
  }

  def getEntry(dataset: String): collection.concurrent.Map[String, JsonNode] = {
    entryDb.get(dataset).orElse(Option.apply(new TrieMap[String, JsonNode]())).get
  }

  def deleteEntry(dataset: String): String = {
    val entryDbSize = entryDb.get(dataset).size
    entryDb.remove(dataset)
    entryDbSize.toString
  }
}