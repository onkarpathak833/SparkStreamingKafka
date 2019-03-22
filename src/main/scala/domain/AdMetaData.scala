/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package domain

import scala.annotation.switch

/**
 * * Advertising metadata used for tracking and analytic as well as billing and general capturing.
 * @param id The unique ID for this advertisement, for example `USA-BLIP-1234`.
 * @param template_id The template ID that was used when rendering this advertisement. If any was used.
 * @param adunit_id The ad unit that was used when rendering this advertisement. If any was used.
 * @param adunit_type The ad unit that was used when rendering this advertisement. If any was used.
 * @param height The base height of the advertisement. If it was rendered.
 * @param width The base width of the advertisement. If it was rendered.
 * @param url * The URL that can be used to preview the advertisement that was rendered. If it was rendered.
 * @param variables The variables associated to this ad, for example 'pin' or other custom variables for the advertisement.
 * @param scores The scores associated to this advertisement, if any are applicable.
 */
case class AdMetaData(var id: Option[String] = None, var template_id: Option[String] = None, var adunit_id: Option[String] = None, var adunit_type: Option[String] = None, var height: Option[Int] = None, var width: Option[Int] = None, var url: Option[String] = None, var variables: Option[Map[String, String]] = None, var scores: Option[Map[String, Double]] = None) extends org.apache.avro.specific.SpecificRecordBase {
  def this() = this(None, None, None, None, None, None, None, None, None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 1 => {
        template_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 2 => {
        adunit_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 3 => {
        adunit_type match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 4 => {
        height match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 5 => {
        width match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 6 => {
        url match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 7 => {
        variables match {
          case Some(x) => {
            val map: java.util.HashMap[String, Any] = new java.util.HashMap[String, Any]
            x foreach { kvp =>
              val key = kvp._1
              val value = kvp._2
              map.put(key, value)
            }
            map
          }
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 8 => {
        scores match {
          case Some(x) => {
            val map: java.util.HashMap[String, Any] = new java.util.HashMap[String, Any]
            x foreach { kvp =>
              val key = kvp._1
              val value = kvp._2
              map.put(key, value)
            }
            map
          }
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 1 => this.template_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 2 => this.adunit_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 3 => this.adunit_type = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 4 => this.height = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Int]]
      case 5 => this.width = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Int]]
      case 6 => this.url = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 7 => this.variables = {
        value match {
          case null => None
          case _ => Some(value match {
            case (map: java.util.Map[_,_]) => {
              scala.collection.JavaConverters.mapAsScalaMapConverter(map).asScala.toMap map { kvp =>
                val key = kvp._1.toString
                val value = kvp._2
                (key, value.toString)
              }
            }
          })
        }
      }.asInstanceOf[Option[Map[String, String]]]
      case 8 => this.scores = {
        value match {
          case null => None
          case _ => Some(value match {
            case (map: java.util.Map[_,_]) => {
              scala.collection.JavaConverters.mapAsScalaMapConverter(map).asScala.toMap map { kvp =>
                val key = kvp._1.toString
                val value = kvp._2
                (key, value)
              }
            }
          })
        }
      }.asInstanceOf[Option[Map[String, Double]]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = AdMetaData.SCHEMA$
}

object AdMetaData {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AdMetaData\",\"namespace\":\"com.catalina.platform.avro\",\"doc\":\"* Advertising metadata used for tracking and analytic as well as billing and general capturing.\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"doc\":\"The unique ID for this advertisement, for example `USA-BLIP-1234`.\",\"default\":null},{\"name\":\"template_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The template ID that was used when rendering this advertisement. If any was used.\",\"default\":null},{\"name\":\"adunit_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The ad unit that was used when rendering this advertisement. If any was used.\",\"default\":null},{\"name\":\"adunit_type\",\"type\":[\"null\",\"string\"],\"doc\":\"The ad unit that was used when rendering this advertisement. If any was used.\",\"default\":null},{\"name\":\"height\",\"type\":[\"null\",\"int\"],\"doc\":\"The base height of the advertisement. If it was rendered.\",\"default\":null},{\"name\":\"width\",\"type\":[\"null\",\"int\"],\"doc\":\"The base width of the advertisement. If it was rendered.\",\"default\":null},{\"name\":\"url\",\"type\":[\"null\",\"string\"],\"doc\":\"* The URL that can be used to preview the advertisement that was rendered. If it was rendered.\",\"default\":null},{\"name\":\"variables\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"The variables associated to this ad, for example \'pin\' or other custom variables for the advertisement.\",\"default\":null},{\"name\":\"scores\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"double\"}],\"doc\":\"The scores associated to this advertisement, if any are applicable.\",\"default\":null}]}")
}