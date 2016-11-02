package Chapter3

object Exercise5 extends App {

  /**
    * Implement function dropWhile
    * "List" refers to the implementation in this package.
    */

  def dropWhile[T](as: List[T], f: T => Boolean): List[T] = as match {
    case Cons(x,xs) if f(x) => dropWhile(xs, f)
    case l => l
  }

  val list = List[Int](1,2,3,4,5,6)

  println("List : " + list)

  println("Drop 2 : " + dropWhile(list, (x: Int) => x < 3))

}
