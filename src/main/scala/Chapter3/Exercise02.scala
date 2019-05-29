package Chapter3

object Exercise02 extends App {

  /**
    * Implement function tail such as it takes constant time.
    * "List" refers to the implementation in this package.
    */

  def tail[T](as: List[T]): List[T] = as match {
    case Nil => throw new Error("Tail of empty list")
    case Cons(_, xs) => xs
  }

  val list = List(1,2,3)

  println("List : " + list)

  println("Tail : " + tail(list))
}
