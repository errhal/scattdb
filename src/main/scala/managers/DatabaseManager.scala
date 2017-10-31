package managers

import java.io.File

import com.fasterxml.jackson.databind.{JsonNode, ObjectMapper}
import config.ConfigurationProvider

object DatabaseManager {

  def saveData(datafile:String, data: Any): Unit = {

  }

  def loadData(datafile:String): JsonNode = {
    val dbFile = new File(ConfigurationProvider.getDbLocation() + "/" + datafile + ".db")
    val objectMapper = new ObjectMapper()
    val jsonNode = objectMapper.readValue(dbFile, classOf[JsonNode])
    jsonNode
  }



}
