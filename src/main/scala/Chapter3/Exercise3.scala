package Chapter3

object Exercise3 extends App {

  /**
    * Implement function setHead
    * "List" refers to the implementation in this package.
    */

  def setHead[T](h: T, as: List[T]): List[T] = as match {
    case Nil => List(h)
    case Cons(x, xs) => Cons(h, xs)
  }

  val list = List[Int](1,2,3)

  println("List : " + list)

  println("With head 0 : " + setHead(0,list))
}
