package services

import java.lang.IllegalArgumentException

import managers.DatabaseManager

/**
  * Created by Kamil Radziszewski on 01.11.17.
  */
object QueryService {

  val keyStoreSelectPattern = "query\\[select key\\(([A-Za-z0-9]*)\\) from ([A-Za-z0-9]*)\\]"
  val keyStoreInsertPattern = "query\\[insert key\\(([A-Za-z0-9]*)\\) into ([A-Za-z0-9]*) data\\(([^\\(\\)]*)\\)\\]"

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
        "Succesfully inserted one key."
      } else {
        "Failed to insert specified key."
      }
    } else {
      "Invalid query."
    }
  }

  def getKeyValue(message: String): String = {

    val keyValue = keyStoreSelectPattern.r.findAllIn(message)
    DatabaseManager.getKey(keyValue.group(2), keyValue.group(1))
  }

  def putKeyValue(message: String): Boolean = {
    val keyValue = keyStoreInsertPattern.r.findAllIn(message)
    DatabaseManager.putKey(keyValue.group(2), keyValue.group(1), keyValue.group(3))
  }

}
