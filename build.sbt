name := "SparkStreamingKafka"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.3.0",
  "org.apache.spark" %% "spark-streaming" % "2.3.0",
  "org.apache.spark" %% "spark-sql" % "2.3.0",
  "com.typesafe" % "config" % "1.3.2",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2" excludeAll ExclusionRule (
    organization = "com.fasterxml.jackson.core"
  ),

  "org.apache.spark" % "spark-sql-kafka-0-10_2.11" % "2.3.0",
  "org.apache.spark" % "spark-streaming-kafka-0-8_2.11" % "2.3.0",
  "org.apache.spark" %% "spark-streaming-kinesis-asl" % "2.3.0"
)