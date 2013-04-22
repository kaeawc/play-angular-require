package controllers

import play.api._
import play.api.mvc._
import models.Message


object Chat extends Application {

	/**
	 * Should give the current state of the chatroom + buddylist
	 */
	def connect = UserAction {
		request => user => Ok(views.html.index())
	}

	/**
	 * Should be a WebSocket that broadcasts to all other users
	 */
	def message = UserAction {
		request => user => Ok("")
	}
}