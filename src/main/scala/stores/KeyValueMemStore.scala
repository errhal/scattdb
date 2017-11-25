package stores

import java.util.concurrent.{ConcurrentHashMap, ConcurrentMap}


object KeyValueMemStore {

  val keyValueDb = new ConcurrentHashMap[String, ConcurrentHashMap[String, AnyRef]]

  def putValue(data: String, key: String, value: AnyRef): Boolean = {

    if (!keyValueDb.containsKey(data)) {
      keyValueDb.put(data, new ConcurrentHashMap[String, AnyRef])
    }
    keyValueDb.get(data).put(key, value)
    true
  }

  def getValue(data: String, key: String): AnyRef = {
    if (!keyValueDb.containsKey(data)) throw new IllegalArgumentException("Specified data does not exist in memory.")
    keyValueDb.get(data).get(key)
  }

  def getKeyValueMap(): ConcurrentHashMap[String, ConcurrentHashMap[String, AnyRef]] = keyValueDb

}
