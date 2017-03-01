import Dependencies.{`scalatest`, `jmdns`}
import Settings._
import sbt.Keys.libraryDependencies

lazy val `csw-location` = project
  .settings(commonSettings)
  .settings(
    libraryDependencies ++= Seq(
      `jmdns`,
      `scalatest` % Test
    )
  )

resolvers += Resolver.bintrayRepo("kpritam", "tw")
resolvers += Resolver.url(
  "bintray-kpritam-tw",
  url("https://tw-tmt.bintray.com/tw/"))(
  Resolver.ivyStylePatterns)