package models

import play.api.libs.json._
import play.api.libs.json.Json._
import play.api.libs.functional.syntax._

case class User(
	id:Long,
	first:String,
	last:String,
	email:String
)

object User extends Function4[Long,String,String,String,User] {

	implicit val r = Json.reads[User]
	implicit val w = Json.writes[User]

	def parse(json:String):User = {
		if(json == "") throw new Exception("Can't parse a User from an empty JSON string.")
		Json.fromJson(Json.parse(json)).get
	}

	def toJson(user:User):String = {
		Json.stringify(Json.toJson(user))
	}
}
