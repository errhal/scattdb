package services

import java.lang.IllegalArgumentException

import managers.DatabaseManager
import stores.EntryMemStore

object QueryService {

  val keyStoreSelectPattern = "query\\[select[ ]+key\\(([A-Za-z0-9]+)\\)[ ]+from[ ]+([A-Za-z0-9]+)\\]"
  val keyStoreInsertPattern = "query\\[insert[ ]+key\\(([A-Za-z0-9]+)\\)[ ]+into[ ]+([A-Za-z0-9]+)[ ]+data\\(([^\\(\\)]+)\\)\\]"
  val entryStoreSelectPattern = "query\\[select[ ]+entry\\(([^\\(\\)]+)\\)[ ]+from[ ]+([A-Za-z0-9]+)\\]"
  val entryStoreInsertPattern = "query\\[insert[ ]+entry\\(([^\\(\\)]+)\\)[ ]+into[ ]+([A-Za-z0-9]+)\\]"

  def parseQuery(message: String): String = {

    if (message.matches(keyStoreSelectPattern)) {
      try {
        getKeyValue(message)
      } catch {
        case e: IllegalArgumentException => e.getMessage
      }
    }
    else if (message.matches(keyStoreInsertPattern)) {
      if (putKeyValue(message)) {
        "Successfully inserted one key."
      } else {
        "Failed to insert specified key."
      }
    } else if (message.matches(entryStoreSelectPattern)) {
      if (putEntry(message)) {
        "Successfully inserted one entry."
      } else {
        "Failed to insert specified key."
      }
    } else if (message.matches(entryStoreInsertPattern)) {
      try {
        getEntry(message)
      } catch {
        case e: IllegalArgumentException => e.getMessage
      }
    } else {
      "Invalid query."
    }
  }

  def getKeyValue(message: String): String = {

    val keyValue = keyStoreSelectPattern.r.findAllIn(message)
    val dataset = keyValue.group(2)
    val key = keyValue.group(1)

    DatabaseManager.getKey(dataset, key)
  }

  def putKeyValue(message: String): Boolean = {
    val keyValue = keyStoreInsertPattern.r.findAllIn(message)
    val dataset = keyValue.group(2)
    val key = keyValue.group(1)
    val value = keyValue.group(3)
    DatabaseManager.putKey(dataset, key, value)
  }

  def getEntry(message: String): String = {
    val entryQuery = entryStoreSelectPattern.r.findAllIn(message)
    val dataset = entryQuery.group(1)
    // TODO: passing entry query param
    val entry = entryQuery.group(0)
    DatabaseManager.getEntry(dataset)
  }

  def putEntry(message: String): Boolean = {
    val entryQuery = entryStoreSelectPattern.r.findAllIn(message)
    val dataset = entryQuery.group(1)
    val entry = entryQuery.group(0)
    DatabaseManager.putEntry(dataset, entry)
    true
  }

}
