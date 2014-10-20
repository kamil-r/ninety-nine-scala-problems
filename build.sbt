import _root_.sbt.Keys._

name := "ninety-nine-scala-problems"

organization  := "com.example"

version       := "0.1"

scalaVersion  := "2.11.2"

libraryDependencies ++= {
  val scalaTestVer = "2.2.1"
  val jUnitVer = "4.10"
  Seq(
    "org.scalatest" % "scalatest_2.11" % scalaTestVer % "test",
    "junit" % "junit" % jUnitVer % "test"
  )
}