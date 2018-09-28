package com.roek5803.simpleakka

import akka.actor.{ActorSystem, Props}
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.stream.ActorMaterializer
import akka.util.Timeout
import com.roek5803.simpleakka.RequestHandler.ComputePi

import scala.concurrent.duration._
import scala.io.StdIn

object Application extends App {

  val port: Int = 8085

  implicit val actorSystem = ActorSystem("my-system")
  implicit val materializer = ActorMaterializer()
  // needed for the future flatMap/onComplete in the end
  implicit val executionContext = actorSystem.dispatcher

  import akka.pattern.ask // ask needs a dispatcher

  val route: Route =
    path("test") {
      get {
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http</h1>"))
      }
    } ~
      pathPrefix("api") {
        pathPrefix("pi") {
          get {
            implicit val askTimeout: Timeout = 30.seconds
            val actor = actorSystem.actorOf(Props[RequestHandler])
            val future = actor ? ComputePi(1000000)

            onSuccess(future) { response =>
              complete(HttpEntity(ContentTypes.`text/plain(UTF-8)`, response.toString))
            }
          }
        }
      }

  val bindingFuture = Http().bindAndHandle(route, "localhost", port)

  println(s"Server online at http://localhost:$port")
  println("Press RETURN to stop...")
  StdIn.readLine() // let it run until user presses return
  bindingFuture
    .flatMap(_.unbind()) // trigger unbinding from the port
    .onComplete(_ => actorSystem.terminate()) // and shutdown when done

}
