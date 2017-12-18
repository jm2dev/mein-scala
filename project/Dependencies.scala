import sbt._

object Dependencies {
  lazy val CatsVersion = "1.0.0-RC1"
  lazy val CirceVersion = "0.8.0"
  lazy val Http4sVersion = "0.17.5"
  lazy val LogbackVersion = "1.2.3"
  lazy val ScalatestVersion = "3.0.4"

  val cats = "org.typelevel"           %% "cats-core"            % CatsVersion
  val circeGeneric = "io.circe"        %% "circe-generic"        % CirceVersion
  val circeLiteral = "io.circe"        %% "circe-literal"        % CirceVersion
  val http4sBlazeServer = "org.http4s" %% "http4s-blaze-server"  % Http4sVersion
  val http4sCirce = "org.http4s"       %% "http4s-circe"         % Http4sVersion
  val http4sDsl = "org.http4s"         %% "http4s-dsl"           % Http4sVersion
  val logbackClassic = "ch.qos.logback" %  "logback-classic"     % LogbackVersion
  val scalactic = "org.scalactic"      %% "scalactic"            % ScalatestVersion
  val scalatest = "org.scalatest"      %% "scalatest"            % ScalatestVersion

  val catsExercisesDeps = Seq(
    cats,
    scalactic, 
    scalatest % Test
  )

  val restExercisesDeps = Seq(
    circeGeneric,
    circeLiteral,
    http4sBlazeServer,
    http4sCirce,
    http4sDsl,
    logbackClassic,
    scalactic, 
    scalatest % Test
  )

  val standardExercisesDeps = Seq(
    scalactic, 
    scalatest % Test
  )
}
