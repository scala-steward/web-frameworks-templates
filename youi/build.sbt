name := """youi-seed"""

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.8"

val youiV = "0.2.2"

libraryDependencies ++= Seq(
  "io.youi" %% "youi-server-undertow" % youiV,
  "io.youi" %% "youi-core"            % youiV,
  "io.youi" %% "youi-app"             % youiV,
  "io.youi" %% "youi-app"             % youiV,
  "io.youi" %% "youi-communication"   % youiV
)
