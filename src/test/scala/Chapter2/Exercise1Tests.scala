package Chapter2

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by julien on 01.11.16.
  */
class Exercise1Tests extends FlatSpec with Matchers {

  "1th Fibonacci number of Exercise 2.1" should "be 0" in {
    Chapter2.Exercise1 fibonacci 1 shouldBe 0
  }

  "2th Fibonacci number of Exercise 2.1" should "be 1" in {
    Chapter2.Exercise1 fibonacci 2 shouldBe 1
  }

  "8th Fibonacci number of Exercise 2.1" should "be 13" in {
    Chapter2.Exercise1 fibonacci 8 shouldBe 13
  }

}
