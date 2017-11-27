import sbt._

object Dependencies {
  lazy val scalatestVersion = "3.0.4"

  val scalactic = "org.scalactic" %% "scalactic" % scalatestVersion
  val scalatest = "org.scalatest" %% "scalatest" % scalatestVersion

  val catsExercisesDeps = Seq(
    scalactic, 
    scalatest % Test
  )
}
