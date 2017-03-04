package org.tmt.csw.location

object Hello extends Greeting with App {
  val x : Int = 15
  val y : Int = 18

  if (x < y){
    println(s"x : $x")
  }

}

trait Greeting {
  lazy val greeting: String = "hello"
}
