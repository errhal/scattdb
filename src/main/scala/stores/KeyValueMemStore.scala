package stores

import java.util.concurrent.ConcurrentHashMap


object KeyValueMemStore {

  val keyValueDb = new ConcurrentHashMap[String, ConcurrentHashMap[String, AnyRef]]

  def getValue(data: String, key: String): AnyRef = {
    if (!keyValueDb.containsKey(data)) throw new IllegalArgumentException("Specified data does not exist in memory.")
    keyValueDb.get(data).get(key)
  }

  def putValue(data: String, key: String, value: AnyRef): Boolean = {

    if (!keyValueDb.containsKey(data)) {
      keyValueDb.put(data, new ConcurrentHashMap[String, AnyRef])
    }
    keyValueDb.get(data).put(key, value)
    true
  }

  def deleteValue(dataset: String, key: String): String = {
    val datasetMap = keyValueDb.get(dataset)
    if(datasetMap != null && datasetMap.containsKey(key)) {
      datasetMap.remove(key)
      return "1"
    }
    "0"
  }

  def getKeyValueMap(): ConcurrentHashMap[String, ConcurrentHashMap[String, AnyRef]] = keyValueDb

}
