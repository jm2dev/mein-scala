import Dependencies._

lazy val commonSettings = Seq(
  organization := "com.optimates",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.4"
)

scalacOptions += "-Ypartial-unification"

lazy val root = (project in file("."))
  .aggregate(
    standardExercises,
    catsExercises,
    restExercises
  )

lazy val standardExercises = (project in file("standard-exercises"))
  .settings(
    commonSettings,
    libraryDependencies ++= standardExercisesDeps
  )

lazy val catsExercises = (project in file("cats-exercises"))
  .settings(
    commonSettings,
    libraryDependencies ++= catsExercisesDeps
  )

lazy val restExercises = (project in file("rest-exercises"))
  .settings(
    commonSettings,
    libraryDependencies ++= restExercisesDeps
  )
