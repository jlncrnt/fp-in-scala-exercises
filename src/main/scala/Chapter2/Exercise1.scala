package Chapter2
/**
  * Write a recursive function to get the nth
  * Fibonacci number.
  */

object Exercise1 extends App {

  def from[T](n: T)(m: T)(implicit numeric: Numeric[T]): Stream[T] = n #:: from(m)(numeric.plus(n, m))

  def fibonacci(n: Int): Int = from(0)(1) take n last

  // IO side effect as last call to prettify run
  println("9th fibonacci number is : " + fibonacci(9))

}