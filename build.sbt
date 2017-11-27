import Dependencies._

lazy val commonSettings = Seq(
  organization := "com.optimates",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.4"
)

lazy val catsExercises = (project in file("cats-exercises"))
  .settings(
    commonSettings,
    libraryDependencies ++= catsExercisesDeps
  )

