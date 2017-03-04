package org.tmt.csw.location

import org.scalatest.{FunSuite, Matchers}
import org.tmt.csw.location.ComponentType.HCD

class ComponentIdTest extends FunSuite with Matchers {

  test("Should successfully parse Component ID") {
    val componentId: ComponentId = ComponentId.parse("lgsTromboneHCD-HCD").get
    componentId.name shouldEqual "lgsTromboneHCD"
    componentId.componentType should be (HCD)
  }

}
