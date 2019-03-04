package com.sparkkafka.project1

import com.typesafe.config.Config
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.streaming.Trigger
import org.apache.spark.streaming.kafka.KafkaUtils

class SparkKafkaConsumer {

  def start(config: Config): Unit = {


    val sparkSession = SparkSession.builder().appName("Consumer").master("local[*]").getOrCreate()
    val avroDF = sparkSession.readStream.format("kafka")
      .option("kafka.bootstrap.servers", config.getString("kafka_server"))   // comma separated list of broker:host
      .option("subscribe", config.getString("kafka_topic"))    // comma separated list of topics
      .option("startingOffsets", "latest") // read data from the end of the stream
      .load()
      .select("value")

    avroDF.printSchema()

    avroDF.writeStream.format("console").trigger(Trigger.ProcessingTime("2 seconds")).start().awaitTermination()

  }

}
