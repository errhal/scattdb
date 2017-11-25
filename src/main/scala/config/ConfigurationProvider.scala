package config

import java.util.Properties

import scala.io.Source
import scala.util.Try

object ConfigurationProvider {

  val properties = new Properties
  val defaultDatabaseDir = "/tmp/scattdb"
  val defaultIsDbInMemEnabled = false
  val defaultKeyValuePrefix = "kv_"
  val defaultEntryPrefix = "entry_"

  def getProperty(propertyName: String): String = {

    val configProperties = Source.fromResource("config.properties").bufferedReader()
    properties.load(configProperties)
    properties.getProperty(propertyName)
  }

  def getDefaultPort(): Int = Try(getProperty("scattdb.default.port").toInt).getOrElse(9966)

  def getDbLocation(): String = {
    var db = Try(getProperty("scattdb.db.files")).getOrElse(defaultDatabaseDir)
    if (db.isEmpty) db = defaultDatabaseDir
    db
  }

  def isKeyValuePersistenceEnabled(): Boolean =
    Try(getProperty("scattdb.persistKeyValue").toBoolean).getOrElse(defaultIsDbInMemEnabled)

  def isEntryPersistenceEnabled(): Boolean =
    Try(getProperty("scattdb.persistKeyValue").toBoolean).getOrElse(defaultIsDbInMemEnabled)
}
