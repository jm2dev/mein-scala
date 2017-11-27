import sbt._

object Dependencies {
  lazy val catsVersion = "1.0.0-RC1"
  lazy val scalatestVersion = "3.0.4"

  val cats = "org.typelevel" %% "cats-core" % "1.0.0-RC1"
  val scalactic = "org.scalactic" %% "scalactic" % scalatestVersion
  val scalatest = "org.scalatest" %% "scalatest" % scalatestVersion

  val catsExercisesDeps = Seq(
    cats,
    scalactic, 
    scalatest % Test
  )

  val standardExercisesDeps = Seq(
    scalactic, 
    scalatest % Test
  )
}
