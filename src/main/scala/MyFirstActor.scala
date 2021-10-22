package net.pryszawa.akkademo

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.{AbstractBehavior, ActorContext, Behaviors}

class MyFirstActor(context: ActorContext[String]) extends AbstractBehavior[String](context) {

  override def onMessage(msg: String): Behavior[String] = msg match {
    case "hello" =>
      println("Hello World!")
      this
    case "stop" =>
      println("Stopping actor...")
      Behaviors.stopped
    case txt: String =>
      println(s"Received: '$txt'")
      this
  }

}
