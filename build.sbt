organization := "io.cequence"

name := "pinecone-openai-scala-demo"

version := "0.0.1"

// Supported Scala versions
val scala212 = "2.12.15"
val scala213 = "2.13.10"
val scala3 = "3.2.2"

scalaVersion := scala212

val openAIScalaVersion = "0.3.2"

libraryDependencies ++= Seq(
  "io.cequence" %% "pinecone-scala-client" % version.value,
  "io.cequence" %% "openai-scala-client" % openAIScalaVersion
)
