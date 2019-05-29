package Chapter2

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by julien on 01.11.16.
  */
class Exercise02Tests extends FlatSpec with Matchers {

  "A sorted Array of int" should "return true with function <" in {
    val arr: Array[Int] = Array[Int](1,2,3,4,5,6,7,8,9)
    val fun: (Int, Int) => Boolean = (a: Int, b: Int) => a < b
    assert(Exercise02.isSorted(arr, fun))
  }

  "An unsorted Array of int" should "return false with function <" in {
    val arr: Array[Int] = Array[Int](1,3,2,4)
    val fun: (Int, Int) => Boolean = (a: Int, b: Int) => a < b
    assert(! Exercise02.isSorted(arr, fun) )
  }

  "A sorted Array of double" should "return true with function <" in {
    val arr: Array[Double] = Array[Double](1,2,3,4,5,6,7,8,9)
    def fun: (Double, Double) => Boolean = (a: Double, b: Double) => a < b
    assert(Exercise02 isSorted(arr, fun))
  }

  "An array of arbitrary objects" should "return true with function defined <" in {
    case class Arbitrary(n: Int) { def <(that: Arbitrary) = this.n < that.n }
    def fun: (Arbitrary, Arbitrary) => Boolean = (a: Arbitrary, b:Arbitrary) => a < b
    val (smaller, bigger) = (Arbitrary(0), Arbitrary(1))
    val arr: Array[Arbitrary] = Array[Arbitrary](smaller, bigger)
    assert(Exercise02 isSorted(arr, fun))
  }

}
