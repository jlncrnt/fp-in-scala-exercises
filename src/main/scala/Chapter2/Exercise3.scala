package Chapter2

/**
  * Write the implementation of curry function
  */
object Exercise3 extends App {

  def curry[A, B, C](f: (A, B) => C): A => B => C = {
    (a: A) => (b: B) => f(a: A, b: B) // f(A,B) returns C and => is right associative
  }

  // IO side effect as last call to prettify run
  def madras: (List[Char], Int) => String = (a: List[Char], b: Int) => a.mkString + b.toString
  def recipe = Exercise3 curry madras
  def meal = recipe("Vindaloo".toList)
  val mealNumber = meal(8)
  println("Result of a curry function parametrized with Vindaloo and called with 8 : " + mealNumber)

}
