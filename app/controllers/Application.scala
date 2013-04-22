package controllers

import play.api._
import play.api.mvc._
import models.User

trait Application extends Controller {

	def UserAction(action:Request[AnyContent] => Option[User] => Result):EssentialAction = Action {
		request => action(request)(None)
	}
}