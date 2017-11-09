package managers

import java.io.File

import com.fasterxml.jackson.databind.{JavaType, JsonNode, ObjectMapper}
import config.ConfigurationProvider
import stores.KeyValueMemStore

object DatabaseManager {

  val keyValueDbFile = "keyValue.db"

  def initDbFiles(): Unit = {
    initializeKeyValueDbFile()
  }

  def initializeKeyValueDbFile(): Unit = {
    val dbFile = new File(ConfigurationProvider.getDbLocation() + "/" + keyValueDbFile)
    if (!dbFile.exists()) {
      dbFile.createNewFile()
    } else {
    }
  }

  def saveData(datafile: String, data: Any): Unit = {

  }

  def loadData(datafile: String): JsonNode = {
    val dbFile = new File(ConfigurationProvider.getDbLocation() + "/" + datafile + ".db")
    val objectMapper = new ObjectMapper()
    val jsonNode = objectMapper.readValue(dbFile, classOf[JsonNode])
    jsonNode
  }

  def getKey(data: String, key: String): String = {

    if (!ConfigurationProvider.isDbInMemEnabled()) throw new NotImplementedError()
    new ObjectMapper().writeValueAsString(getValueFromMem(data, key))

    //    TODO: persistence
    //        val objectMapper = new ObjectMapper()
    //        val jsonNode = objectMapper.readValue("", classOf[JsonNode])
    //    jsonNode
  }

  def putKey(data: String, key: String, value: String): Boolean = {
    val deserialized = new ObjectMapper().readValue(value, classOf[JsonNode])
    KeyValueMemStore.putValue(data, key, deserialized)
  }

  def getValueFromMem(data: String, key: String): AnyRef = {
    KeyValueMemStore.getValue(data, key)
  }

}
