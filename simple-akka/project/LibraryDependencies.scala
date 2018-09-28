import sbt._

object LibraryDependencies {

  object Versions {
    val scaldi = "0.5.8"
    val akka = "2.5.11"
    val akkaHttp = "10.0.11"
    val undertow = "1.3.22.Final"
    val scalaSoap = "1.8.0"
  }

  lazy val akka = Seq(
    "com.typesafe.akka" %% "akka-http"                              % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-http-spray-json"                   % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-http-xml"                          % Versions.akkaHttp,
    "com.typesafe.akka" %% "akka-actor"                             % Versions.akka,
    "com.typesafe.akka" %% "akka-stream"                            % Versions.akka,
    "com.typesafe.akka" %% "akka-persistence"                       % Versions.akka,
    "com.typesafe.akka" %% "akka-slf4j"                             % Versions.akka,

    "com.typesafe.akka" %% "akka-testkit"                           % Versions.akka,

    "org.iq80.leveldb" % "leveldb" % "0.7",
    "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8"
  )

  lazy val slf4j = Seq(
    "org.slf4j" % "slf4j-api" % "1.7.12",
    "org.slf4j" % "log4j-over-slf4j" % "1.7.12",
    "ch.qos.logback" % "logback-classic" % "1.1.7",
    "net.logstash.logback" % "logstash-logback-encoder" % "4.7"
  )

  lazy val scaldi = Seq(
    "org.scaldi" %% "scaldi" % Versions.scaldi,
    "org.scaldi" %% "scaldi-akka" % Versions.scaldi
  )

  lazy val undertow = Seq(
    "io.undertow" % "undertow-core" % Versions.undertow,
    "io.undertow" % "undertow-servlet" % Versions.undertow
  )

  lazy val scalatest = Seq(
//    "org.scalactic" %% "scalactic" % "2.2.6",
//    "org.scalatest" %% "scalatest" % "2.2.6" % "test"
  )

}
