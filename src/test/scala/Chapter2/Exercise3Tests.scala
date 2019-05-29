package Chapter2

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by julien on 01.11.16.
  */
class Exercise3Tests extends FlatSpec with Matchers {

  "Curry function" should "be able to curry (Char, Int) => String function" in {
    def madras: (List[Char], Int) => String = (a: List[Char], b: Int) => a.mkString + b.toString
    noException should be thrownBy Exercise03.curry(madras)

  }

  "Ex. 3 curry function" should "be able to curry a (Char, Int) => String function" in {
    def madras: (List[Char], Int) => String = (a: List[Char], b: Int) => a.mkString + b.toString
    def recipe = Exercise03 curry madras
    def meal = recipe("Vindaloo".toList)
    val mealNumber = meal(8)
    mealNumber should fullyMatch regex "Vindaloo8"
  }

}
