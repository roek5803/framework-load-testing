package com.roek5803.simpleakka

import java.util.Date

import akka.actor.{Actor, ActorLogging}

object RequestHandler {

  final case class ComputePi(n: Int)

}

class RequestHandler() extends Actor with ActorLogging {

  import RequestHandler._

  def receive = {
    case cmd: ComputePi =>
      log.debug(s"handling $cmd")
      computePi(cmd.n)
      sender() ! new Date().toString
      context.stop(self)
  }

  def computePi(n: Int): Double = {
    var sequenceFormula = 0d
    var counter = 1

    while ( {
      counter < n
    }) {
      sequenceFormula = sequenceFormula + ((1.0 / (2.0 * counter - 1)) - (1.0 / (2.0 * counter + 1)))

      counter += 2
    }

    4 * sequenceFormula
  }

}
