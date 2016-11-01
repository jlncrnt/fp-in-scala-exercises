import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by julien on 01.11.16.
  */
class ExercisesTests extends FlatSpec with Matchers {

  "8th Fibonacci number of Exercise 2.1" should "be 21" in {
    Exercise21 fibonacci 9 shouldBe 21
  }

}
