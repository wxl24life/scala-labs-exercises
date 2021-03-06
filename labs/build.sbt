import sbt.Path

name := "ScalaLabs"

organization := "Xebia B.V."

version := "1.0"

scalaVersion := "2.12.5"

scalacOptions ++= Seq("-unchecked", "-deprecation")

resolvers ++= Seq("Local Maven Repository" at "file:///"+Path.userHome+"/.m2/repository",
        "Signpost releases" at "https://oss.sonatype.org/content/repositories/signpost-releases/")

// You should be able to use the following to read all dependencies from the pom.xml file, but somehow those aren't picked up.
// see: https://github.com/harrah/xsbt/wiki/Library-Management
// externalPom()

libraryDependencies ++= Seq("joda-time" % "joda-time" % "1.6",
        "org.apache.httpcomponents" % "httpclient" % "4.1.1",
        "oauth.signpost" % "signpost-core" % "1.2",
        "oauth.signpost" % "signpost-commonshttp4" % "1.2",
        "org.scalatest" %% "scalatest" % "3.0.5" % "test",
        "org.specs2" %% "specs2-core" % "4.0.3" % "test",
        "org.specs2" %% "specs2-junit" % "4.0.3" % "test",
        "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
        "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.0",
        "org.json4s" %% "json4s-native" % "3.5.3",
        "junit" % "junit" % "4.7" % "test",
        "org.slf4j" % "slf4j-simple" % "1.4.2")


