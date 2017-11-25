package managers

import java.io._
import java.util.concurrent.ConcurrentHashMap

import com.fasterxml.jackson.databind.{JavaType, JsonNode, ObjectMapper}
import com.google.common.io.Files
import config.ConfigurationProvider
import stores.{EntryMemStore, KeyValueMemStore}

object DatabaseManager {

  val keyValueDbFile = "keyValue.db"
  val objectMapper = new ObjectMapper

  /**
    * Used for reading data from files on application startup.
    */
  def initDbFiles(): Unit = {
    initializeKeyValueDbFile()
  }

  // TODO: thread unsafe method
  def initializeKeyValueDbFile(): Unit = {
    val dbDir = new File(ConfigurationProvider.getDbLocation())
    val kvFiles = dbDir.listFiles(new FilenameFilter {
      override def accept(file: File, s: String): Boolean = s.startsWith(ConfigurationProvider.defaultKeyValuePrefix)
    })

    if (kvFiles == null) return
    kvFiles.foreach((file: File) => {
      val dataset = file.getName.substring(ConfigurationProvider.defaultKeyValuePrefix.length)
      val keyValueMap = KeyValueMemStore.getKeyValueMap()
      if (keyValueMap.contains(dataset)) {
        throw new RuntimeException("Corrupted datafile.")
      }
      val deserializedMap = objectMapper.readValue(new FileReader(file), classOf[ConcurrentHashMap[String, AnyRef]])
      keyValueMap.put(dataset, deserializedMap)
    })
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
    * @param key     we want obtain value for
    * @return serialized value
    */
  def getKey(dataset: String, key: String): String = {

    if (!ConfigurationProvider.isKeyValuePersistenceEnabled()) throw new NotImplementedError()
    objectMapper.writeValueAsString(getValueFromMem(dataset, key))
  }

  /**
    * Puts value into key/value dataset. Depending on configuration, it puts values into memory or memory + persistence.
    *
    * @param dataset we want put key/value into
    * @param key     we want put value for
    * @param value   we want to put
    * @return true if value was successfully inserted, false otherwise
    */
  def putKey(dataset: String, key: String, value: String): Boolean = {
    val deserialized = objectMapper.readValue(value, classOf[JsonNode])
    val isInserted = KeyValueMemStore.putValue(dataset, key, deserialized)
    if (isInserted) if (ConfigurationProvider.isKeyValuePersistenceEnabled()) persistKeyValue(dataset)
    isInserted
  }

  def getValueFromMem(data: String, key: String): AnyRef = {
    KeyValueMemStore.getValue(data, key)
  }

  /**
    * Persist key value map in file
    * TODO: append-only commit logs
    *
    * @param dataset name, used as filename for persistence
    */
  def persistKeyValue(dataset: String): Unit = {
    val file = new File(ConfigurationProvider.getDbLocation()
      + File.separator
      + ConfigurationProvider.defaultKeyValuePrefix
      + dataset)

    if (!file.exists()) {
      Files.createParentDirs(file)
      file.createNewFile()
    }
    val printWriter = new PrintWriter(file)
    printWriter.print(objectMapper.writeValueAsString(KeyValueMemStore.getKeyValueMap().get(dataset)))
    printWriter.close()
  }

  def getEntry(dataset: String): String = {
    //TODO: persistence data
    val entry = getEntryFromMem(dataset)
    objectMapper.writeValueAsString(entry)
  }

  def putEntry(dataset: String, entry: String): Boolean = {
    //TODO: persistence data
    val deserializedEntry = objectMapper.readValue(entry, classOf[JsonNode])
    val isInserted = putEntryIntoMem(dataset, deserializedEntry)
    if (isInserted) if (ConfigurationProvider.isEntryPersistenceEnabled()) persistEntry(dataset)
    isInserted
  }

  def getEntryFromMem(dataset: String): ConcurrentHashMap[Long, JsonNode] = {
    EntryMemStore.getEntry(dataset)
  }

  def putEntryIntoMem(dataset: String, entry: JsonNode): Boolean = {
    EntryMemStore.putEntry(dataset, entry)
  }

  def persistEntry(dataset: String) = {
    val file = new File(ConfigurationProvider.getDbLocation()
      + File.separator
      + ConfigurationProvider.defaultEntryPrefix
      + dataset)

    if (!file.exists()) {
      Files.createParentDirs(file)
      file.createNewFile()
    }
    val printWriter = new PrintWriter(file)
    printWriter.print(objectMapper.writeValueAsString(EntryMemStore.entryDb.get(dataset)))
    printWriter.close
  }

}
