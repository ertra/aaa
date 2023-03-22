ThisBuild / scalaVersion := "2.12.17"

//val scala3Version = "3.2.2"
ThisBuild / version := "1.0-SNAPSHOT"
// PlayJava
lazy val root = (project in file("."))
  .settings(
    name := "aaa",
    maintainer := "your.name@company.org",
    executableScriptName := "main",
    //scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      guice
     // "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2",
     // "org.scala-lang.modules" %% "scala-xml" % "2.1.0" exclude("com.fasterxml.jackson.core", "jackson-databind")
    )
  )
  .enablePlugins(PlayJava,JavaAppPackaging)

//mainClass in Compile := Some("play.core.server.ProdServerStart")
