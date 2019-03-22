package com.sparkkafka.project1

import java.io.{ByteArrayOutputStream, File}
import java.nio.file.{Files, Path}
import java.util.{Properties, UUID}

import avrohugger.Generator
import avrohugger.format.SpecificRecord
import com.sparkkafka.project1.HelloMain.applicationPath
import com.twitter.bijection.Injection
import com.twitter.bijection.avro.GenericAvroCodecs
import com.typesafe.config.{Config, ConfigFactory}
import kafka.producer.{KeyedMessage, Producer, ProducerConfig}
import org.apache.avro.Schema
import org.apache.avro.file.DataFileReader
import org.apache.avro.generic.GenericRecord
import org.apache.avro.generic.GenericDatumReader
import org.apache.avro.generic.GenericRecord
import org.apache.avro.io.DatumReader
import org.apache.avro.io.DecoderFactory
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

object SimpleKafkaProducer {

  def main(args: Array[String]): Unit = {
    val avroGenerator = new AvroDataGenerator
    val props = new Properties()
    props.put("metadata.broker.list", "localhost:9092")
    props.put("message.send.max.retries", "5")
    props.put("request.required.acks", "-1")
    props.put("serializer.class", "kafka.serializer.DefaultEncoder")
    props.put("bootstrap.servers", "localhost:9092")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    //    props.put("value.serializer", "io.confluent.kafka.serializers.KafkaAvroSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.ByteArraySerializer")
    props.put("key.converter.schema.registry.url", "http://localhost:8081");
    props.put("value.converter.schema.registry.url", "http://localhost:8081");
    props.put("schema.registry.url", "http://localhost:8081")
    props.put("client.id", UUID.randomUUID().toString())
    val producer = new KafkaProducer[String, Array[Byte]](props)
    val avroSchema: Schema = avroGenerator.readSchema()
    val avroFile = new File("/Users/techops/Documents/FreelanceProjects/avro-random-generator/Event1.avro")
    val avroBytes: Array[Byte] = Files.readAllBytes(avroFile.toPath)

    import org.apache.avro.generic.GenericRecord
    val recordInjection: Injection[GenericRecord, Array[Byte]] = GenericAvroCodecs.toBinary[GenericRecord](avroSchema)

    val datumReader = new GenericDatumReader[GenericRecord](avroSchema)
    val dataFileReader: DataFileReader[GenericRecord] = new DataFileReader[GenericRecord](avroFile, datumReader)
    val prodRecord = new ProducerRecord[String, Array[Byte]]("stream", "key", avroBytes)
    producer.send(prodRecord)

//    while (dataFileReader.hasNext) {
//      val record: GenericRecord = dataFileReader.next()
//      println(record)
//      val byteData: Array[Byte] = recordInjection.apply(record)
//      val prodRecord = new ProducerRecord[String, Array[Byte]]("stream", "key", byteData)
//      producer.send(prodRecord)
//    }
    producer.close()

  }


  private def generateScalaClass(): Unit  = {

    val schemaFile = new File("/Users/techops/Documents/FreelanceProjects/avro-random-generator/Event.avsc")
    val generator = new Generator(SpecificRecord)
    generator.fileToFile(schemaFile, "/Users/techops/Documents/FreelanceProjects/SparkKafka_HDInsights/SparkStreamingKafka/src/main/scala/com/sparkkafka/project1") // default output path = "target/generated-sources"

  }

}
