package stores

import scala.collection.concurrent.TrieMap


/**
  * Created by Kamil Radziszewski on 08.11.17.
  */
object KeyValueMemStore {

  val keyValueDb = new TrieMap[String, TrieMap[String, AnyRef]]

  def putValue(data: String, key: String, value: AnyRef): Boolean = {
    var dataKeyValue = keyValueDb.getOrElseUpdate(data, new TrieMap[String, AnyRef]())
    dataKeyValue += (key -> value)
    true
  }

  def getValue(data: String, key: String): AnyRef = {
    if (!keyValueDb.contains(data)) throw new IllegalArgumentException("Specified data does not exist in memory.")
    keyValueDb(data)(key)
  }

}
