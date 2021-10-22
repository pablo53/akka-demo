name := "akka-demo"

version := "0.1"

scalaVersion := "2.13.6"

idePackagePrefix := Some("net.pryszawa.akkademo")

val AkkaVersion = "2.6.17"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
