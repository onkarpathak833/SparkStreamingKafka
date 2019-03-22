/** MACHINE-GENERATED FROM AVRO SCHEMA. DO NOT EDIT DIRECTLY */
package domain


import scala.annotation.switch

/**
 * @param cid The id of the consumer this event is correlated with
 * @param device_id This anonymously identifies a particular user, device, or browser instance. For the web, this is generally stored as a first-party cookie with a two-year expiration. For mobile apps, this is randomly generated for each particular instance of an application install. The value of this field should be a random UUID (version 4) as described in http://www.ietf.org/rfc/rfc4122.txt
 * @param time The time (UTC) in milliseconds since epoch. In Java new Date().getTime()
 * @param source_ids The unique advertisement identifiers correlated with this event (offer, ad, mclu, etc)
 * @param type The type of event that was triggered from redemption of a coupon, to an impression, to a generic tracking event
 * @param system_id The unique system identifier that was responsible for generating this event
 * @param media_type The type of media delivered or correlated with this particular event, for example 'ad' or 'coupon'
 * @param model The type of scoring model or distribution model correlated to this particular event
 * @param channel_type The channel which is correlated with this event
 * @param session_id The unique session identifier used to correlate multiple events together as part of an overall click-stream, web-session, or transaction. Includes attribution and conversion modeling where impression can be delivered days ago and conversion is associated to the original session
 * @param site_id The unique identifier for where this event was triggered (for store this is the store #, for websites, the affiliate or web property id)
 * @param network_id The unique identifier for where this event was triggered (for store this is chain #, for websites, the network or affiliate id)
 * @param lane_id The unique identifier for the lane which generated this event, only applicable if a store event
 * @param latitude The latitude where the user was when this event was generated in the format: 27.9710,82.4650
 * @param longitude The latitude where the user was when this event was generated in the format: 27.9710,82.4650
 * @param shopper_type The type of shopper and/or classification of the shopper at the time the event was triggered (for example; 'new', 'abusive', 'control')
 * @param campaign_id A campaign id associate to the media distributed
 * @param campaign_name Specifies the campaign name. Example (direct)
 * @param campaign_keyword Specifies the campaign keyword.
 * @param advertiser_id The advertiser that was associate to this event due to its media being generated, this could be retailer if retailer provided content or a manufacturer # given a manufacturer program
 * @param ad_group_id Optional ad group identifier for the collection of media shown to a user (aka: award)
 * @param ad_creative_set_id The ID of the creative set used when displaying to the user a collection of ids (aka: mclu)
 * @param conversion_total_purchased_amount A number representing the value that placed on the conversion. It could reflect a currency value, quantity, weighted value, or dollar value
 * @param conversion_total_purchased_qty A number representing the overall conversion quantity (units sold based on conversion)
 * @param conversion_purchased_upcs The upcs associated with the conversion event and attributed to the conversion quantity and dollar value
 * @param event_value Specifies the event value. Values must be non-negative.
 * @param event_label Specifies the event label.
 * @param event_action Specifies the event action. Must not be empty.
 * @param event_category Specifies the event category. Must not be empty.
 * @param exception_fatal Specifies whether the exception was fatal.
 * @param ttl TTL length in seconds, will automatically delete rows once the expiration time is reached.
 * @param social_network Specifies the social network, for example Facebook or Google Plus.
 * @param social_action Specifies the social interaction action. For example on Google Plus when a user clicks the +1 button, the social action is 'plus'.
 * @param social_action_target Specifies the target of a social interaction. This value is typically a URL but can be any text.
 * @param doc_host Specifies the hostname from which content was hosted.
 * @param doc_path The path portion of the page URL. Should begin with '/'.
 * @param doc_title The title of the page / document.
 * @param doc_referrer Specifies which referral source brought traffic to a website. This value is also used to compute the traffic source. The format of this value is a URL.
 * @param mobile_app_name Specifies the application name
 * @param mobile_app_id Application identifier.
 * @param mobile_app_version Specifies the application version.
 * @param category_level_1 The 1st level in a category taxonomy. For example in the taxonomy GROCERY > PET FOOD > CAT FOOD > DRY CAT FOOD this would be 'GROCERY'
 * @param category_level_2 The 2nd level in a category taxonomy. For example in the taxonomy GROCERY > PET FOOD > CAT FOOD > DRY CAT FOOD this would be 'PET FOOD'
 * @param category_level_3 The 3rd level in a category taxonomy. For example in the taxonomy GROCERY > PET FOOD > CAT FOOD > DRY CAT FOOD this would be 'CAT FOOD'
 * @param category_level_4 The 4th level in a category taxonomy. For example in the taxonomy GROCERY > PET FOOD > CAT FOOD > DRY CAT FOOD this would be 'DRY CAT FOOD'
 * @param user_ip The IP address of the user (if applicable to channel) used to inject lat/long if not provided through direct interaction (GPS/Phone vs. Browser)
 * @param id The unique ID of this event for correlation and duplicate detection
 * @param country_code The country code where this event is generated against
 * @param custom_attributes Custom dimensions or properties for use with reporting or analytics
 * @param user_traits The traits for the specified user, which allow us to track user engagement by various dynamic classifications of the consumer throughout time. For example heavy, medium, loyal, abandoner, new visitor, etc
 * @param location_admin_zone_0 The location administrative level 0 zone that this event was triggered in (see: diva-gis). This is always country level. This differs from country code in that country code is the country that owns the network, not where the user is engaging (for example network is owned by USA but touchpoint happens in Japan)
 * @param location_admin_zone_1 The location administrative level 1 zone that this event was triggered in (see: diva-gis). For USA this is the state. Other countries like Japan may use different admin taxonomies. For example 県(KEN)/PREFRECTURE for level 1.
 * @param location_admin_zone_2 The location administrative level 2 zone that this event was triggered in (see: diva-gis). For USA this is county. Other countries like  Japan may use different admin taxonomies. For Japan this might be municipality 市(SHI)/CITY for level 2 depending on the size of the municipality.
 * @param user_agent The browser/user agent used by the user to access (in digital/mobile) channels
 * @param user_language The language the user had their device set to when accessing the content
 * @param category_level_1_code The code for the category level 1, which is, if available the identifier for the category level 1 text. Most systems should ignore this value.
 * @param category_level_2_code The code for the category level 2, which is, if available the identifier for the category level 2 text. Most systems should ignore this value.
 * @param threshold_balance The last balance of the user when dealing with loyalty thresholds.
 * @param threshold_sequence The last sequence of the user when dealing with loyalty thresholds
 * @param threshold_reset A flag indicating if the threshold should be reset.
 * @param gen The time (UTC) in milliseconds since epoch that the event was generated. This differs from ts in that it contains the timestamp when the event was received and is used for data extraction and analytics. In Java new Date().getTime()
 * @param client_id The client ID that sponsored this advertisement
 * @param placement_id The placement that hosted this advertisement, if any applies
 * @param bid_id The identifier for the bid that won this space
 * @param exchange_id The identifier of the exchange that this advertisement was bid within
 * @param bid_amount The cost/price of the bid that resulted in the win.
 * @param bid_currency The currency of the price, assumed to be what is the country's currency code if not specified
 * @param ads 
 */
case class Event(var cid: Option[String] = None, var device_id: Option[String] = None, var time: Option[Long] = None, var source_ids: Option[Seq[String]] = None, var `type`: EventType = EventType.system, var system_id: Option[String] = None, var media_type: Option[String] = None, var model: Option[String] = None, var channel_type: ChannelType = ChannelType.other, var session_id: Option[String] = None, var site_id: Option[String] = None, var network_id: Option[String] = None, var lane_id: Option[String] = None, var latitude: Option[Double] = None, var longitude: Option[Double] = None, var shopper_type: Option[String] = None, var campaign_id: Option[String] = None, var campaign_name: Option[String] = None, var campaign_keyword: Option[String] = None, var advertiser_id: Option[String] = None, var ad_group_id: Option[String] = None, var ad_creative_set_id: Option[String] = None, var conversion_total_purchased_amount: Option[Double] = None, var conversion_total_purchased_qty: Option[Int] = None, var conversion_purchased_upcs: Option[Seq[String]] = None, var event_value: Option[String] = None, var event_label: Option[String] = None, var event_action: Option[String] = None, var event_category: Option[String] = None, var exception_fatal: Option[Boolean] = None, var ttl: Option[Int] = None, var social_network: Option[String] = None, var social_action: Option[String] = None, var social_action_target: Option[String] = None, var doc_host: Option[String] = None, var doc_path: Option[String] = None, var doc_title: Option[String] = None, var doc_referrer: Option[String] = None, var mobile_app_name: Option[String] = None, var mobile_app_id: Option[String] = None, var mobile_app_version: Option[String] = None, var category_level_1: Option[String] = None, var category_level_2: Option[String] = None, var category_level_3: Option[String] = None, var category_level_4: Option[String] = None, var user_ip: Option[String] = None, var id: Option[String] = None, var country_code: Option[String] = None, var custom_attributes: Option[Map[String, String]] = None, var user_traits: Option[Seq[String]] = None, var location_admin_zone_0: Option[String] = None, var location_admin_zone_1: Option[String] = None, var location_admin_zone_2: Option[String] = None, var user_agent: Option[String] = None, var user_language: Option[String] = None, var category_level_1_code: Option[String] = None, var category_level_2_code: Option[String] = None, var threshold_balance: Option[Double] = None, var threshold_sequence: Option[Int] = None, var threshold_reset: Option[Boolean] = None, var gen: Option[Long] = None, var client_id: Option[String] = None, var placement_id: Option[String] = None, var bid_id: Option[String] = None, var exchange_id: Option[String] = None, var bid_amount: Option[Double] = None, var bid_currency: Option[String] = None, var ads: Option[Seq[AdMetaData]] = None) extends org.apache.avro.specific.SpecificRecordBase {


  def this() = this(None, None, None, None, EventType.system, None, None, None, ChannelType.other, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None, None)
  def get(field$: Int): AnyRef = {
    (field$: @switch) match {
      case 0 => {
        cid match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 1 => {
        device_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 2 => {
        time match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 3 => {
        source_ids match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 4 => {
        `type`
      }.asInstanceOf[AnyRef]
      case 5 => {
        system_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 6 => {
        media_type match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 7 => {
        model match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 8 => {
        channel_type
      }.asInstanceOf[AnyRef]
      case 9 => {
        session_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 10 => {
        site_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 11 => {
        network_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 12 => {
        lane_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 13 => {
        latitude match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 14 => {
        longitude match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 15 => {
        shopper_type match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 16 => {
        campaign_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 17 => {
        campaign_name match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 18 => {
        campaign_keyword match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 19 => {
        advertiser_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 20 => {
        ad_group_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 21 => {
        ad_creative_set_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 22 => {
        conversion_total_purchased_amount match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 23 => {
        conversion_total_purchased_qty match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 24 => {
        conversion_purchased_upcs match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 25 => {
        event_value match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 26 => {
        event_label match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 27 => {
        event_action match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 28 => {
        event_category match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 29 => {
        exception_fatal match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 30 => {
        ttl match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 31 => {
        social_network match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 32 => {
        social_action match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 33 => {
        social_action_target match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 34 => {
        doc_host match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 35 => {
        doc_path match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 36 => {
        doc_title match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 37 => {
        doc_referrer match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 38 => {
        mobile_app_name match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 39 => {
        mobile_app_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 40 => {
        mobile_app_version match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 41 => {
        category_level_1 match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 42 => {
        category_level_2 match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 43 => {
        category_level_3 match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 44 => {
        category_level_4 match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 45 => {
        user_ip match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 46 => {
        id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 47 => {
        country_code match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 48 => {
        custom_attributes match {
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
      case 49 => {
        user_traits match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 50 => {
        location_admin_zone_0 match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 51 => {
        location_admin_zone_1 match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 52 => {
        location_admin_zone_2 match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 53 => {
        user_agent match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 54 => {
        user_language match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 55 => {
        category_level_1_code match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 56 => {
        category_level_2_code match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 57 => {
        threshold_balance match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 58 => {
        threshold_sequence match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 59 => {
        threshold_reset match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 60 => {
        gen match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 61 => {
        client_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 62 => {
        placement_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 63 => {
        bid_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 64 => {
        exchange_id match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 65 => {
        bid_amount match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 66 => {
        bid_currency match {
          case Some(x) => x
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case 67 => {
        ads match {
          case Some(x) => scala.collection.JavaConverters.bufferAsJavaListConverter({
            x map { x =>
              x
            }
          }.toBuffer).asJava
          case None => null
        }
      }.asInstanceOf[AnyRef]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
  }
  def put(field$: Int, value: Any): Unit = {
    (field$: @switch) match {
      case 0 => this.cid = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 1 => this.device_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 2 => this.time = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 3 => this.source_ids = {
        value match {
          case null => None
          case _ => Some(value match {
            case (array: java.util.List[_]) => {
              Seq((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
                x.toString
              }: _*))
            }
          })
        }
      }.asInstanceOf[Option[Seq[String]]]
      case 4 => this.`type` = {
        value
      }.asInstanceOf[EventType]
      case 5 => this.system_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 6 => this.media_type = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 7 => this.model = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 8 => this.channel_type = {
        value
      }.asInstanceOf[ChannelType]
      case 9 => this.session_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 10 => this.site_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 11 => this.network_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 12 => this.lane_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 13 => this.latitude = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Double]]
      case 14 => this.longitude = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Double]]
      case 15 => this.shopper_type = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 16 => this.campaign_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 17 => this.campaign_name = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 18 => this.campaign_keyword = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 19 => this.advertiser_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 20 => this.ad_group_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 21 => this.ad_creative_set_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 22 => this.conversion_total_purchased_amount = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Double]]
      case 23 => this.conversion_total_purchased_qty = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Int]]
      case 24 => this.conversion_purchased_upcs = {
        value match {
          case null => None
          case _ => Some(value match {
            case (array: java.util.List[_]) => {
              Seq((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
                x.toString
              }: _*))
            }
          })
        }
      }.asInstanceOf[Option[Seq[String]]]
      case 25 => this.event_value = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 26 => this.event_label = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 27 => this.event_action = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 28 => this.event_category = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 29 => this.exception_fatal = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 30 => this.ttl = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Int]]
      case 31 => this.social_network = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 32 => this.social_action = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 33 => this.social_action_target = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 34 => this.doc_host = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 35 => this.doc_path = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 36 => this.doc_title = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 37 => this.doc_referrer = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 38 => this.mobile_app_name = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 39 => this.mobile_app_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 40 => this.mobile_app_version = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 41 => this.category_level_1 = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 42 => this.category_level_2 = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 43 => this.category_level_3 = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 44 => this.category_level_4 = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 45 => this.user_ip = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 46 => this.id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 47 => this.country_code = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 48 => this.custom_attributes = {
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
      case 49 => this.user_traits = {
        value match {
          case null => None
          case _ => Some(value match {
            case (array: java.util.List[_]) => {
              Seq((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
                x.toString
              }: _*))
            }
          })
        }
      }.asInstanceOf[Option[Seq[String]]]
      case 50 => this.location_admin_zone_0 = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 51 => this.location_admin_zone_1 = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 52 => this.location_admin_zone_2 = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 53 => this.user_agent = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 54 => this.user_language = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 55 => this.category_level_1_code = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 56 => this.category_level_2_code = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 57 => this.threshold_balance = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Double]]
      case 58 => this.threshold_sequence = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Int]]
      case 59 => this.threshold_reset = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Boolean]]
      case 60 => this.gen = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Long]]
      case 61 => this.client_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 62 => this.placement_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 63 => this.bid_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 64 => this.exchange_id = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 65 => this.bid_amount = {
        value match {
          case null => None
          case _ => Some(value)
        }
      }.asInstanceOf[Option[Double]]
      case 66 => this.bid_currency = {
        value match {
          case null => None
          case _ => Some(value.toString)
        }
      }.asInstanceOf[Option[String]]
      case 67 => this.ads = {
        value match {
          case null => None
          case _ => Some(value match {
            case (array: java.util.List[_]) => {
              Seq((scala.collection.JavaConverters.asScalaIteratorConverter(array.iterator).asScala.toSeq map { x =>
                x
              }: _*))
            }
          })
        }
      }.asInstanceOf[Option[Seq[AdMetaData]]]
      case _ => new org.apache.avro.AvroRuntimeException("Bad index")
    }
    ()
  }
  def getSchema: org.apache.avro.Schema = Event.SCHEMA$
}

object Event {
  val SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"com.catalina.platform.avro\",\"fields\":[{\"name\":\"cid\",\"type\":[\"null\",\"string\"],\"doc\":\"The id of the consumer this event is correlated with\",\"default\":null},{\"name\":\"device_id\",\"type\":[\"null\",\"string\"],\"doc\":\"This anonymously identifies a particular user, device, or browser instance. For the web, this is generally stored as a first-party cookie with a two-year expiration. For mobile apps, this is randomly generated for each particular instance of an application install. The value of this field should be a random UUID (version 4) as described in http://www.ietf.org/rfc/rfc4122.txt\",\"default\":null},{\"name\":\"time\",\"type\":[\"null\",\"long\"],\"doc\":\"The time (UTC) in milliseconds since epoch. In Java new Date().getTime()\",\"default\":null},{\"name\":\"source_ids\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"The unique advertisement identifiers correlated with this event (offer, ad, mclu, etc)\",\"default\":null},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"EventType\",\"doc\":\"The type of event\",\"symbols\":[\"redemption\",\"impression\",\"click\",\"checkout\",\"media_delivery\",\"visit\",\"control\",\"system\",\"conversion\",\"non_conversion\",\"pin\",\"threshold\",\"pageview\",\"screenview\",\"item\",\"social\",\"exception\",\"print\",\"cart\",\"wallet\",\"goal\",\"detection\",\"notifications\",\"download\",\"clip\"]},\"doc\":\"The type of event that was triggered from redemption of a coupon, to an impression, to a generic tracking event\",\"default\":\"system\"},{\"name\":\"system_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The unique system identifier that was responsible for generating this event\",\"default\":null},{\"name\":\"media_type\",\"type\":[\"null\",\"string\"],\"doc\":\"The type of media delivered or correlated with this particular event, for example \'ad\' or \'coupon\'\",\"default\":null},{\"name\":\"model\",\"type\":[\"null\",\"string\"],\"doc\":\"The type of scoring model or distribution model correlated to this particular event\",\"default\":null},{\"name\":\"channel_type\",\"type\":{\"type\":\"enum\",\"name\":\"ChannelType\",\"symbols\":[\"mobile\",\"store\",\"web\",\"video\",\"email\",\"app\",\"kiosk\",\"direct\",\"other\"]},\"doc\":\"The channel which is correlated with this event\",\"default\":\"other\"},{\"name\":\"session_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The unique session identifier used to correlate multiple events together as part of an overall click-stream, web-session, or transaction. Includes attribution and conversion modeling where impression can be delivered days ago and conversion is associated to the original session\",\"default\":null},{\"name\":\"site_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The unique identifier for where this event was triggered (for store this is the store #, for websites, the affiliate or web property id)\",\"default\":null},{\"name\":\"network_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The unique identifier for where this event was triggered (for store this is chain #, for websites, the network or affiliate id)\",\"default\":null},{\"name\":\"lane_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The unique identifier for the lane which generated this event, only applicable if a store event\",\"default\":null},{\"name\":\"latitude\",\"type\":[\"null\",\"float\"],\"doc\":\"The latitude where the user was when this event was generated in the format: 27.9710,82.4650\",\"default\":null},{\"name\":\"longitude\",\"type\":[\"null\",\"float\"],\"doc\":\"The latitude where the user was when this event was generated in the format: 27.9710,82.4650\",\"default\":null},{\"name\":\"shopper_type\",\"type\":[\"null\",\"string\"],\"doc\":\"The type of shopper and/or classification of the shopper at the time the event was triggered (for example; \'new\', \'abusive\', \'control\')\",\"default\":null},{\"name\":\"campaign_id\",\"type\":[\"null\",\"string\"],\"doc\":\"A campaign id associate to the media distributed\",\"default\":null},{\"name\":\"campaign_name\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the campaign name. Example (direct)\",\"default\":null},{\"name\":\"campaign_keyword\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the campaign keyword.\",\"default\":null},{\"name\":\"advertiser_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The advertiser that was associate to this event due to its media being generated, this could be retailer if retailer provided content or a manufacturer # given a manufacturer program\",\"default\":null},{\"name\":\"ad_group_id\",\"type\":[\"null\",\"string\"],\"doc\":\"Optional ad group identifier for the collection of media shown to a user (aka: award)\",\"default\":null},{\"name\":\"ad_creative_set_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The ID of the creative set used when displaying to the user a collection of ids (aka: mclu)\",\"default\":null},{\"name\":\"conversion_total_purchased_amount\",\"type\":[\"null\",\"double\"],\"doc\":\"A number representing the value that placed on the conversion. It could reflect a currency value, quantity, weighted value, or dollar value\",\"default\":null,\"aliases\":[\"purchased_amount\"]},{\"name\":\"conversion_total_purchased_qty\",\"type\":[\"null\",\"int\"],\"doc\":\"A number representing the overall conversion quantity (units sold based on conversion)\",\"default\":null,\"aliases\":[\"purchased_qty\"]},{\"name\":\"conversion_purchased_upcs\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"The upcs associated with the conversion event and attributed to the conversion quantity and dollar value\",\"default\":null,\"aliases\":[\"purchased_upcs\"]},{\"name\":\"event_value\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the event value. Values must be non-negative.\",\"default\":null},{\"name\":\"event_label\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the event label.\",\"default\":null},{\"name\":\"event_action\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the event action. Must not be empty.\",\"default\":null},{\"name\":\"event_category\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the event category. Must not be empty.\",\"default\":null},{\"name\":\"exception_fatal\",\"type\":[\"null\",\"boolean\"],\"doc\":\"Specifies whether the exception was fatal.\",\"default\":null},{\"name\":\"ttl\",\"type\":[\"null\",\"int\"],\"doc\":\"TTL length in seconds, will automatically delete rows once the expiration time is reached.\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"social_network\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the social network, for example Facebook or Google Plus.\",\"default\":null},{\"name\":\"social_action\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the social interaction action. For example on Google Plus when a user clicks the +1 button, the social action is \'plus\'.\",\"default\":null},{\"name\":\"social_action_target\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the target of a social interaction. This value is typically a URL but can be any text.\",\"default\":null},{\"name\":\"doc_host\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the hostname from which content was hosted.\",\"default\":null},{\"name\":\"doc_path\",\"type\":[\"null\",\"string\"],\"doc\":\"The path portion of the page URL. Should begin with \'/\'.\",\"default\":null},{\"name\":\"doc_title\",\"type\":[\"null\",\"string\"],\"doc\":\"The title of the page / document.\",\"default\":null},{\"name\":\"doc_referrer\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies which referral source brought traffic to a website. This value is also used to compute the traffic source. The format of this value is a URL.\",\"default\":null},{\"name\":\"mobile_app_name\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the application name\",\"default\":null},{\"name\":\"mobile_app_id\",\"type\":[\"null\",\"string\"],\"doc\":\"Application identifier.\",\"default\":null},{\"name\":\"mobile_app_version\",\"type\":[\"null\",\"string\"],\"doc\":\"Specifies the application version.\",\"default\":null},{\"name\":\"category_level_1\",\"type\":[\"null\",\"string\"],\"doc\":\"The 1st level in a category taxonomy. For example in the taxonomy GROCERY > PET FOOD > CAT FOOD > DRY CAT FOOD this would be \'GROCERY\'\",\"default\":null,\"ordering\":\"ignore\"},{\"name\":\"category_level_2\",\"type\":[\"null\",\"string\"],\"doc\":\"The 2nd level in a category taxonomy. For example in the taxonomy GROCERY > PET FOOD > CAT FOOD > DRY CAT FOOD this would be \'PET FOOD\'\",\"default\":null,\"ordering\":\"ignore\"},{\"name\":\"category_level_3\",\"type\":[\"null\",\"string\"],\"doc\":\"The 3rd level in a category taxonomy. For example in the taxonomy GROCERY > PET FOOD > CAT FOOD > DRY CAT FOOD this would be \'CAT FOOD\'\",\"default\":null,\"ordering\":\"ignore\"},{\"name\":\"category_level_4\",\"type\":[\"null\",\"string\"],\"doc\":\"The 4th level in a category taxonomy. For example in the taxonomy GROCERY > PET FOOD > CAT FOOD > DRY CAT FOOD this would be \'DRY CAT FOOD\'\",\"default\":null,\"ordering\":\"ignore\"},{\"name\":\"user_ip\",\"type\":[\"null\",\"string\"],\"doc\":\"The IP address of the user (if applicable to channel) used to inject lat/long if not provided through direct interaction (GPS/Phone vs. Browser)\",\"default\":null},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"doc\":\"The unique ID of this event for correlation and duplicate detection\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"country_code\",\"type\":[\"null\",\"string\"],\"doc\":\"The country code where this event is generated against\",\"default\":null},{\"name\":\"custom_attributes\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"Custom dimensions or properties for use with reporting or analytics\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"user_traits\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"doc\":\"The traits for the specified user, which allow us to track user engagement by various dynamic classifications of the consumer throughout time. For example heavy, medium, loyal, abandoner, new visitor, etc\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"location_admin_zone_0\",\"type\":[\"null\",\"string\"],\"doc\":\"The location administrative level 0 zone that this event was triggered in (see: diva-gis). This is always country level. This differs from country code in that country code is the country that owns the network, not where the user is engaging (for example network is owned by USA but touchpoint happens in Japan)\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"location_admin_zone_1\",\"type\":[\"null\",\"string\"],\"doc\":\"The location administrative level 1 zone that this event was triggered in (see: diva-gis). For USA this is the state. Other countries like Japan may use different admin taxonomies. For example 県(KEN)/PREFRECTURE for level 1.\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"location_admin_zone_2\",\"type\":[\"null\",\"string\"],\"doc\":\"The location administrative level 2 zone that this event was triggered in (see: diva-gis). For USA this is county. Other countries like  Japan may use different admin taxonomies. For Japan this might be municipality 市(SHI)/CITY for level 2 depending on the size of the municipality.\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"user_agent\",\"type\":[\"null\",\"string\"],\"doc\":\"The browser/user agent used by the user to access (in digital/mobile) channels\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"user_language\",\"type\":[\"null\",\"string\"],\"doc\":\"The language the user had their device set to when accessing the content\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"category_level_1_code\",\"type\":[\"null\",\"string\"],\"doc\":\"The code for the category level 1, which is, if available the identifier for the category level 1 text. Most systems should ignore this value.\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"category_level_2_code\",\"type\":[\"null\",\"string\"],\"doc\":\"The code for the category level 2, which is, if available the identifier for the category level 2 text. Most systems should ignore this value.\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"threshold_balance\",\"type\":[\"null\",\"double\"],\"doc\":\"The last balance of the user when dealing with loyalty thresholds.\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"threshold_sequence\",\"type\":[\"null\",\"int\"],\"doc\":\"The last sequence of the user when dealing with loyalty thresholds\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"threshold_reset\",\"type\":[\"null\",\"boolean\"],\"doc\":\"A flag indicating if the threshold should be reset.\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"gen\",\"type\":[\"null\",\"long\"],\"doc\":\"The time (UTC) in milliseconds since epoch that the event was generated. This differs from ts in that it contains the timestamp when the event was received and is used for data extraction and analytics. In Java new Date().getTime()\",\"default\":null},{\"name\":\"client_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The client ID that sponsored this advertisement\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"placement_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The placement that hosted this advertisement, if any applies\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"bid_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The identifier for the bid that won this space\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"exchange_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The identifier of the exchange that this advertisement was bid within\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"bid_amount\",\"type\":[\"null\",\"double\"],\"doc\":\"The cost/price of the bid that resulted in the win.\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"bid_currency\",\"type\":[\"null\",\"string\"],\"doc\":\"The currency of the price, assumed to be what is the country\'s currency code if not specified\",\"default\":null,\"order\":\"ignore\"},{\"name\":\"ads\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AdMetaData\",\"doc\":\"* Advertising metadata used for tracking and analytic as well as billing and general capturing.\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"doc\":\"The unique ID for this advertisement, for example `USA-BLIP-1234`.\",\"default\":null},{\"name\":\"template_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The template ID that was used when rendering this advertisement. If any was used.\",\"default\":null},{\"name\":\"adunit_id\",\"type\":[\"null\",\"string\"],\"doc\":\"The ad unit that was used when rendering this advertisement. If any was used.\",\"default\":null},{\"name\":\"adunit_type\",\"type\":[\"null\",\"string\"],\"doc\":\"The ad unit that was used when rendering this advertisement. If any was used.\",\"default\":null},{\"name\":\"height\",\"type\":[\"null\",\"int\"],\"doc\":\"The base height of the advertisement. If it was rendered.\",\"default\":null},{\"name\":\"width\",\"type\":[\"null\",\"int\"],\"doc\":\"The base width of the advertisement. If it was rendered.\",\"default\":null},{\"name\":\"url\",\"type\":[\"null\",\"string\"],\"doc\":\"* The URL that can be used to preview the advertisement that was rendered. If it was rendered.\",\"default\":null},{\"name\":\"variables\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"string\"}],\"doc\":\"The variables associated to this ad, for example \'pin\' or other custom variables for the advertisement.\",\"default\":null},{\"name\":\"scores\",\"type\":[\"null\",{\"type\":\"map\",\"values\":\"double\"}],\"doc\":\"The scores associated to this advertisement, if any are applicable.\",\"default\":null}]}}],\"default\":null,\"order\":\"ignore\"}]}")
}