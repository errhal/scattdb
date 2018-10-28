package config

import java.util.Properties

import scala.collection.JavaConverters._
import com.typesafe.config.{ConfigException, ConfigFactory}

import scala.io.Source
import scala.util.Try

/**
  * Object for obtaining general database properties from resources/config.properties file.
  *
  * Available configuration properties:
  *
  * scattdb.port - port for listening client queries (9966 by default)
  * scattdb.dir - directory for persisted db data (/tmp/scattdb by default)
  * scattdb.persistKeyValue - true if needed to persist KV data, false otherwise
  * scattdb.persistEntries - true if needed to persist entries data, false otherwise
  * scattdb.serverType - server type in architecture. There are mainly 3 types of server:
  *   - master/slave - all in one, node can receive and realize queries on the same JVM
  *   - master - for receiving and scattering queries over other nodes
  *   - slave - only for executing queries for a master
  * scattdb.enableStats - true if needed to get statistics about state of the database
  *
  */
object ConfigurationProvider {

  val properties = new Properties
  val defaultDatabaseDir = "/tmp/scattdb"
  val defaultIsDbInMemEnabled = false
  val defaultKeyValuePrefix = "kv_"
  val defaultEntryPrefix = "entry_"
  val hostsConfigPath = "hosts.conf"
  val hostsPropertyPath = "scattdb.hosts"

  def getProperty(propertyName: String): String = {

    val configProperties = Source.fromResource("config.properties").bufferedReader()
    properties.load(configProperties)
    properties.getProperty(propertyName)

  }

  def getDefaultPort(): Int = Try(getProperty("scattdb.port").toInt).getOrElse(9966)

  def getDbLocation(): String = {
    var db = Try(getProperty("scattdb.dir")).getOrElse(defaultDatabaseDir)
    if (db.isEmpty) db = defaultDatabaseDir
    db
  }

  def isKeyValuePersistenceEnabled(): Boolean =
    Try(getProperty("scattdb.persistKeyValue").toBoolean).getOrElse(defaultIsDbInMemEnabled)

  def isEntryPersistenceEnabled(): Boolean =
    Try(getProperty("scattdb.persistKeyValue").toBoolean).getOrElse(defaultIsDbInMemEnabled)

  def getServerType(): Int = {
    getProperty("scattdb.serverType") match {
      case "master/slave" => 0
      case "master" => 1
      case "slave" => 2
      case _ => 0
    }
  }

  def getHostsList(): List[String] = {
    try {
      val hostsEntrySet = ConfigFactory.load(hostsConfigPath).getConfig(hostsPropertyPath).entrySet().asScala
      List.empty[String] ++ (hostsEntrySet map (_.getValue.unwrapped().toString))
    } catch {
      case e: ConfigException => List.empty[String]
    }
  }
}
