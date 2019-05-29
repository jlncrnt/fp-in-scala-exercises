package Chapter3

object Exercise04 extends App {

  /**
    * Implement function drop
    * "List" refers to the implementation in this package.
    */

  def drop[T](as: List[T], n: Int): List[T] = as match {
    case Nil => Nil
    case ls if n == 0 => ls
    case Cons(x,xs) => drop(xs, n-1)
  }

  val list = List[Int](1,2,3,4,5,6)

  println("List : " + list)

  println("Drop 2 : " + drop(list,2))

}
