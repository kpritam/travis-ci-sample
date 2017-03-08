package org.tmt.csw.location

import javax.jmdns.{JmDNS, ServiceInfo}

import org.scalatest.{FunSuite, Matchers}
import org.tmt.csw.location.common.Networks

/**
  * Created by pritamkadam on 3/6/17.
  */
class JmDnsTest extends FunSuite with Matchers {

  test("should create jmdns install and register service"){
    val service = ServiceInfo.create("_tmt._tcp.local.", "tmt3", 516, "")
    val service1 = ServiceInfo.create("_tmt._tcp.local.", "tmt4", 517, "")


    Networks.getPrimaryIpv4Address shouldEqual("10.10.10.10")
    
    val jmDNS = JmDNS.create(Networks.getPrimaryIpv4Address)

    jmDNS.registerService(service)
    jmDNS.registerService(service1)

    jmDNS.getServiceInfo("_tmt._tcp.local.", "tmt3") shouldEqual(ServiceInfo.create("_tmt._tcp.local.", "tmt3", 516, ""))

  }



}
