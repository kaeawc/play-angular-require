package models

import play.api.libs.json._
import play.api.libs.json.Json._
import play.api.libs.functional.syntax._

case class Message(
	id:Long,
	user:String,
	text:String
)

object Message extends Function3[Long,String,String,Message] {

	implicit val r = Json.reads[Message]
	implicit val w = Json.writes[Message]

	def parse(json:String):Message = {
		if(json == "") throw new Exception("Can't parse a Message from an empty JSON string.")
		Json.fromJson(Json.parse(json)).get
	}

	def toJson(message:Message):String = {
		Json.stringify(Json.toJson(message))
	}
}
