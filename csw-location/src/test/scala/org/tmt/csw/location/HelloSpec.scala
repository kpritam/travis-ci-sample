package org.tmt.csw.location

import java.net.NetworkInterface
import javax.jmdns.{JmDNS, ServiceInfo}

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }

  "This test" should "pass" in {
    val Port = 1234

    val service : ServiceInfo = ServiceInfo.create("_tmt._tcp.local.", "tmt3", 516, "")
    val service1 = ServiceInfo.create("_tmt._tcp.local.", "tmt4", 527, "")


    val jmDNS = JmDNS.create();

    jmDNS.registerService(service)

    jmDNS.registerService(service1)

    jmDNS.getServiceInfo("_tmt._tcp.local.", "tmt3") should be (service)

//    jmDNS.list("_tmt._tcp.local.") should be (service)
  }
}
