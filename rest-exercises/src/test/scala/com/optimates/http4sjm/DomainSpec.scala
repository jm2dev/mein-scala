package com.optimates.http4sjm

import org.scalatest.{FunSpec, MustMatchers}


class DomainSpec extends FunSpec with MustMatchers {
  describe("Message") {
    it("should serialize to JSON") {
      messageAsJson()
    }

    it("should deserialize from JSON") {
      messageFromJson()
    }
  }

  //import io.circe._
  //import io.circe.syntax._
  //import io.circe.generic.auto._
  //import org.http4s.circe._

  import io.circe._
  import io.circe.generic.auto._
  import io.circe.syntax._

  import org.http4s._
  import org.http4s.circe._
  import org.http4s.dsl._

  case class Message(message: String)

  val message = Message("Hello, world")

  private[this] def messageAsJson() =
    message.asJson.noSpaces mustEqual "{\"message\":\"Hello, world\"}"

  private[this] def messageFromJson() = 
    ("{\"message\":\"Hello, world\"}").as(jsonOf[Message]) mustEqual message
}
