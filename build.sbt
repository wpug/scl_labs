name := "ScalaLabs"

version := "1.0"

scalaVersion := "2.11.8"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

javaOptions in reStart += "-Dfile.encoding=utf8"
