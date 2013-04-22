import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

	val appName         = "tin-roof"
	val appVersion      = "1.0-SNAPSHOT"

	val appDependencies = Seq(
		"org.sedis" % "sedis_2.9.2" % "1.1.0"
	)
	
	val main = play.Project(appName,appVersion,appDependencies)
}
