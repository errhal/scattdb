package config

import java.util.Properties

import scala.collection.JavaConverters._
import com.typesafe.config.{ConfigException, ConfigFactory}

import scala.io.Source
import scala.util.Try

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
