package Chapter2

/**
  * Write the implementation of an uncurry function
  */
object Exercise4 extends App {

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    val bc = (a: A) => f(a)
    (b: B) => bc(b)
  }

}
