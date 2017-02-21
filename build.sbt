import Dependencies.{scalatest, _}
import Settings._
import sbt.Keys.libraryDependencies

lazy val `csw-location` = project
  .settings(commonSettings)
  .settings(
    libraryDependencies += scalatest % Test
  )
