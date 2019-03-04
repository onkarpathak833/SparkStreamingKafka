package com.sparkkafka.project1

import java.io.File

import com.typesafe.config.{Config, ConfigFactory}
import com.typesafe.scalalogging.LazyLogging

object HelloMain extends LazyLogging {
  var applicationPath: String = ""
  def main(args: Array[String]): Unit = {

    println("Welcome to Hello Main. This can be used for starting kafka consumer as spark stream.")
    if(args.length < 1 ){
      logger.info("Application.conf path not provided. Fallback to default application.conf")
    } else {
       applicationPath = args(0)
    }

    val applicationConfigs: Config = ConfigFactory.parseFile(new File(applicationPath)).withFallback(ConfigFactory.load("application")).resolve()

    new SparkKafkaConsumer().start(applicationConfigs)
  }
}
