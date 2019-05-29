package Chapter2

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by julien on 01.11.16.
  */
class Exercise05Tests extends FlatSpec with Matchers {

  "2.0" should "be converted to \"2.0\" with Double => Int and Int => String function composition" in {
    def f(i: Int): String = i.toString
    def g(d: Double): Int = d.toInt
    def comp: Double => String = Exercise05.compose[Double, Int, String](f,g)
    comp(2.0) shouldBe "2"
  }
}
