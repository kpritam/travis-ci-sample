import javax.jmdns.{JmDNS, ServiceInfo}

val Port = 1234

val service : ServiceInfo = ServiceInfo.create("_tmt._tcp.local.", "tmt3", 516, "")
val service1 = ServiceInfo.create("_tmt._tcp.local.", "tmt4", 527, "")


val jmDNS = JmDNS.create();

//    jmDNS.getName should be ("tmt3")


jmDNS.registerService(service)

jmDNS.registerService(service1)

//jmDNS.getServiceInfo("_tmt._tcp.local.", "tmt3") should be (service)