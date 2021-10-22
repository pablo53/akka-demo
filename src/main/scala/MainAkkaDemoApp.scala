package net.pryszawa.akkademo

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.{ActorContext, Behaviors}

object MainAkkaDemoApp {

  def main(args: Array[String]): Unit = {
    val actorSystem = ActorSystem(
      Behaviors.setup({ ctx: ActorContext[String] => new MyFirstActor(ctx)}),
      "myFirstActorSystem"
    )
    actorSystem ! "hello"
  }

}
