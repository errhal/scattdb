package managers

import java.io.File

import com.fasterxml.jackson.databind.{JavaType, JsonNode, ObjectMapper}
import config.ConfigurationProvider
import stores.KeyValueMemStore

object DatabaseManager {

  val keyValueDbFile = "keyValue.db"
  val objectMapper = new ObjectMapper

  def initDbFiles(): Unit = {
    initializeKeyValueDbFile()
  }

  def initializeKeyValueDbFile(): Unit = {
    val dbFile = new File(ConfigurationProvider.getDbLocation() + File.separator + keyValueDbFile)
    if (!dbFile.exists()) {
      dbFile.createNewFile()
    } else {
    }
  }

  def saveData(datafile: String, data: Any): Unit = {

  }

  def loadData(datafile: String): JsonNode = {
    val dbFile = new File(ConfigurationProvider.getDbLocation() + File.separator + datafile + ".db")
    val jsonNode = objectMapper.readValue(dbFile, classOf[JsonNode])
    jsonNode
  }

  /**
    * Returns serialized value for specified key and dataset. This method always returns values from memory.
    *
    * @param dataset we want get key/value from
    * @param key we want obtain value for
    * @return serialized value
    */
  def getKey(dataset: String, key: String): String = {

    if (!ConfigurationProvider.isDbInMemEnabled()) throw new NotImplementedError()
    objectMapper.writeValueAsString(getValueFromMem(dataset, key))

    //    TODO: persistence
    //        val objectMapper = new ObjectMapper()
    //        val jsonNode = objectMapper.readValue("", classOf[JsonNode])
    //    jsonNode
  }

  /**
    * Puts value into key/value dataset. Depending on configuration, it puts values into memory or memory + persistence.
    *
    * @param dataset we want put key/value into
    * @param key we want put value for
    * @param value we want to put
    * @return true if value was successfully inserted, false otherwise
    */
  def putKey(dataset: String, key: String, value: String): Boolean = {
    if (!ConfigurationProvider.isDbInMemEnabled()) throw new NotImplementedError()
    val deserialized = objectMapper.readValue(value, classOf[JsonNode])
    KeyValueMemStore.putValue(dataset, key, deserialized)
  }

  def getValueFromMem(data: String, key: String): AnyRef = {
    KeyValueMemStore.getValue(data, key)
  }

}
