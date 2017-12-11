organization := "unfiltered"

name := """unfiltered-jetty"""

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "ws.unfiltered" %% "unfiltered-filter" % "0.9.1",
  "ws.unfiltered" %% "unfiltered-jetty"  % "0.9.1",
  "ws.unfiltered" %% "unfiltered-json4s" % "0.9.1"
)

initialCommands := "import example._; import unfiltered.request._; import unfiltered.response._"
