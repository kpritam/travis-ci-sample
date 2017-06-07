import Dependencies.{`scalatest`, `jmdns`}
import Settings._
import sbt.Keys.libraryDependencies

lazy val csw = project
  .in(file("."))
  .aggregate(`csw-location`)

lazy val `csw-location` = project
  .enablePlugins(Coverage)
  .settings(commonSettings)
  .settings(
    libraryDependencies ++= Seq(
      `jmdns`,
      `scalatest` % Test
    )`
  )

resolvers += Resolver.bintrayRepo("kpritam", "tw")