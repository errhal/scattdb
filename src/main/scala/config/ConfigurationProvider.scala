package config

import java.util.Properties
import scala.io.Source

object ConfigurationProvider {

  val properties = new Properties

  def getProperty(propertyName: String): String = {

    val configProperties = Source.fromResource("config.properties").bufferedReader()
    properties.load(configProperties)
    properties.getProperty(propertyName, "9966")
  }

  def getDefaultPort(): Integer = Integer.parseInt(getProperty("scattdb.default.port"))

  def getDbLocation(): String = getProperty("scattdb.db.files")

}
