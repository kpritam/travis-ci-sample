import Dependencies._
import Settings._

lazy val `csw-location` = project
  .settings(commonSettings)
  .settings(
    libraryDependencies += scalatest % Test
  )


resolvers += Resolver.jcenterRepo

resolvers += Resolver.bintrayRepo("otherUser", "otherRepo")
