package Chapter3

object Exercise2 extends App {

  /**
    * Implement function tail such as it takes constant time.
    * "List" refers to the implementation in this package.
    */

  def tail[T](as: List[T]): List[T] = as match {
    case Nil => throw new Error("Tail of empty list")
    case Cons(x, xs) => xs
  }

  val list = List(1,2,3)

  println("List : " + list)

  println("Tail : " + tail(list))
}
