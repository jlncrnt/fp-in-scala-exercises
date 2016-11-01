/**
  * Write a recursive function to get the nth
  * Fibonacci number.
  */

object Exercise21 extends App {

  def from[T](n: T)(m: T)(implicit numeric: Numeric[T]): Stream[T] = n #:: from(m)(numeric.plus(n, m))

  def fibonacci(n: Int): Int = from(0)(1) take n last

}