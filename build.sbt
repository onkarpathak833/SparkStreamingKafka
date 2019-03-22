name := "SparkStreamingKafka"

version := "0.1"

scalaVersion := "2.11.8"

dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-core" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.core" % "jackson-databind" % "2.8.7"
dependencyOverrides += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.7"


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.3.0",
  "org.apache.spark" %% "spark-streaming" % "2.3.0",
  "org.apache.spark" %% "spark-sql" % "2.3.0",
  "org.apache.spark" %% "spark-avro" % "2.4.0",

"com.typesafe" % "config" % "1.3.2",
  "org.apache.spark" %% "spark-hive" % "2.3.0",
  "org.apache.hive" % "hive-common" % "2.1.0",
//  "org.apache.hive" % "hive-metastore" % "2.1.0",
  "org.apache.logging.log4j" % "log4j-api" % "2.11.1",
//  "org.apache.hive" % "hive-cli" % "2.1.0",
//  "org.apache.hive" % "hive-exec" % "2.1.0",
//  "org.apache.hive" % "hive-service" % "2.1.0",
  "org.pentaho" % "pentaho-aggdesigner-algorithm" % "5.1.5-jhyde" % Test,
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2" excludeAll ExclusionRule (
    organization = "com.fasterxml.jackson.core"
  ),

  "org.apache.spark" % "spark-sql-kafka-0-10_2.11" % "2.3.0",
  "org.apache.spark" % "spark-streaming-kafka-0-8_2.11" % "2.3.0",
  "org.apache.avro" % "avro-tools" % "1.8.0",
//  "io.confluent" % "kafka-avro-serializer" % "3.1.1"
  "com.twitter" % "bijection-avro_2.10" % "0.9.2",
  "com.julianpeeters" %% "avrohugger-core" % "1.0.0-RC15"

)

resolvers += Resolver.mavenLocal
resolvers += "Cascading repo" at "http://conjars.org/repo"
//resolvers += "confluent" at "https://packages.confluent.io/maven/"