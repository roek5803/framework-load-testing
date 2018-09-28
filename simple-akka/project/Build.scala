import LibraryDependencies._
import sbt.Keys._
import sbt._

object Build extends Build {

  lazy val commonSettings = Seq(
    organization := "com.roek5803",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.12.4",
    aggregate in update := false
  )

  lazy val showVersion = taskKey[Unit]("Show version")
  val showVersionTask = showVersion := {
    println(version.value)
  }

  lazy val root = Project("simpleakka", file("."))
    .settings(commonSettings ++ Seq(showVersionTask))
    .settings(
      libraryDependencies ++= Seq.concat(
        akka,
        slf4j,
        scalatest
      )
    )

}
