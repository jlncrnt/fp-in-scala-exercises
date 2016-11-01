package Chapter2

/**
  * Write the implementation of curry function
  */
object Exercise3 extends App {

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = {
    (a: A) => (b: B) => f(a: A, b: B) // f(A,B) returns C and => is right associative
  }

}
