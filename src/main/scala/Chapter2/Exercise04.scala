package Chapter2

object Exercise04 extends App {

  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }

  def f1(a: List[Char], i: Int): String = a.mkString + i.toString

  def f2 = uncurry(Exercise03.curry(f1))

  print("Comparing equality of function result to uncurried curry of the same function : ")

  println(f1("Pastis".toList, 51) == f2("Pastis".toList, 51))

}
