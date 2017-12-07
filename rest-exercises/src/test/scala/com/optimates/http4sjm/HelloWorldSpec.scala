package com.optimates.http4sjm

import org.http4s.dsl._
import org.http4s.{Method, Request, Response, Status}
import org.scalatest.{FunSpec, MustMatchers}

class HelloWorldSpec extends FunSpec with MustMatchers {
  describe("HelloWorld") {
    it("should return 200") {
      uriReturns200()
    }
    it("return hello world") {
      uriReturnsHelloWorld()
    }
  }

  private[this] val retHelloWorld: Response = {
    val getHW = Request(Method.GET, uri("/hello/world"))
    val task = HelloWorld.service.orNotFound(getHW)
    task.unsafeRun()
  }

  private[this] def uriReturns200() =
    retHelloWorld.status mustEqual Status.Ok

  private[this] def uriReturnsHelloWorld() =
    retHelloWorld.as[String].unsafeRun() mustEqual "{\"message\":\"Hello, world\"}"
}
