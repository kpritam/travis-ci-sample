package org.tmt.csw.location

import java.net.NetworkInterface
import java.util
import javax.jmdns.{JmDNS, ServiceInfo}

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "hello"
  }

  "This test" should "pass" in {


    val service = ServiceInfo.create("_tmt._tcp.local.", "tmt3", 516, "")
    val service1 = ServiceInfo.create("_tmt._tcp.local.", "tmt4", 527, "")
    val service2 = ServiceInfo.create("_html._tcp.local.", "apache-someuniqueid", 80, "")

    val jmDNS = JmDNS.create()

      jmDNS.registerService(service2)

    jmDNS.registerService(service1)

    jmDNS.getServiceInfo("_html._tcp.local.", "apache-someuniqueid") should be (service1)

//    jmDNS.list("_tmt._tcp.local.") should be (service)
  }
}