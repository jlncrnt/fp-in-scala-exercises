package Chapter2

/**
  * Implement the compose function
  */
object Exercise05 extends App {

  def compose[A, B, C](f: B => C, g: A => B): A => C = {
    (a: A) => f(g(a))
  }

  def f(i: Int): String = i.toString
  def g(d: Double): Int = d.toInt
  def comp: Double => String = compose[Double, Int, String](f,g)
  val (d, c) = (2.0, comp(2.0))

  println(s"Double: $d to String: $c with function composition Double => Int, Int => Char")

}
