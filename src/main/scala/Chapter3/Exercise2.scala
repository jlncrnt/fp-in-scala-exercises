package Chapter3

/**
  * Julien 11.02.2016
  * "List" refers to impl. in this package
  */

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
