package Chapter2

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by julien on 01.11.16.
  */
class Exercise04Tests extends FlatSpec with Matchers {

  "An uncurry function" should "be able to curry an (A => B => C) function without error" in {
    def f(i: Int): Char => String = (c: Char) => List.fill(i)(c).mkString
    noException should be thrownBy Exercise04.uncurry(f)
  }

  "An uncurried function" should "return correct result when called" in {
    def f(i: Int): Char => String = (c: Char) => List.fill(i)(c).mkString
    val g = Exercise04.uncurry(f)
    g(3, 'C') shouldEqual "CCC"
  }

  "A function (A, B) => C" should "be the same after curry + uncurry" in {
    def f(a: List[Char], i: Int): String = a.mkString + i.toString
    def g = Exercise04.uncurry(Exercise03.curry(f))
    f("Road".toList, 66) shouldEqual g("Road".toList, 66)
  }

}
