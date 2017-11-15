package stores

import scala.collection.concurrent.TrieMap

object KeyValueMemStore {

  private val keyValueDb = new TrieMap[String, TrieMap[String, AnyRef]]

  def putValue(data: String, key: String, value: AnyRef): Boolean = {

    if (!keyValueDb.contains(data)) {
      keyValueDb.put(data, new TrieMap[String, AnyRef])
    }
    keyValueDb(data) += (key -> value)
    true
  }

  def getValue(data: String, key: String): AnyRef = {
    if (!keyValueDb.contains(data)) throw new IllegalArgumentException("Specified data does not exist in memory.")
    keyValueDb(data)(key)
  }

}
