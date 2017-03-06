import org.scoverage.coveralls.CoverallsPlugin
import org.scoverage.coveralls.Imports.CoverallsKeys.coverallsToken
import sbt._

object Coverage extends AutoPlugin {
  import scoverage.ScoverageSbtPlugin
  import ScoverageSbtPlugin.autoImport._

  override def requires = ScoverageSbtPlugin && CoverallsPlugin

  override def projectSettings = Seq(
    coverageEnabled := true,
    coverageMinimum := 40,
    coverageFailOnMinimum := true,
    coverageHighlighting := true,
    coverageOutputCobertura := true,
    coverageOutputXML := true
  )

}
