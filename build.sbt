name := "scattdb"

version := "1.0"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.7",
  "com.typesafe.akka" %% "akka-remote" % "2.5.7",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.7" % Test,
  "com.fasterxml.jackson.core" % "jackson-core" % "2.9.2",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.2",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.2",
  "com.google.guava" % "guava" % "23.4-jre",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  "org.antlr" % "antlr4-runtime" % "4.7.1"
)
