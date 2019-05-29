package Chapter2

import org.scalatest._

/**
  * Created by Julien on 01.11.16.
  */
class Exercise01Tests extends FlatSpec with Matchers {

  "1th Fibonacci number of Exercise 2.1" should "be 0" in {
    Exercise01 fibonacci 1 shouldBe 0
  }

  "2th Fibonacci number of Exercise 2.1" should "be 1" in {
    Exercise01 fibonacci 2 shouldBe 1
  }

  "8th Fibonacci number of Exercise 2.1" should "be 13" in {
    Exercise01 fibonacci 8 shouldBe 13
  }

}
