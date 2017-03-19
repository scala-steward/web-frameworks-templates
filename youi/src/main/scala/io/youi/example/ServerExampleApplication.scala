package io.youi.example

import java.io.File

import io.youi.app._
import io.youi.http._
import io.youi.net.ContentType
import io.youi.server.UndertowServer
import io.youi.server.handler.{CachingManager, HttpHandler}
import io.youi.stream.{ById, Delta}

object ServerExampleApplication extends UndertowServer with ExampleApplication with ServerApplication {
  config.clearListeners().addHttpListener("0.0.0.0")


  handler.matcher(path.exact("/hello.txt")).caching(CachingManager.MaxAge(120L)).resource {
    Content.string("Hello World!", ContentType.`text/plain`)
  }

  def main(args: Array[String]): Unit = {
    start()
  }
}