package Chapter3

object Exercise06 extends App {

  /**
    * Implement function init
    * "List" refers to the implementation in this package.
    */

  def init[T](as: List[T]): List[T] = as match {
    case Nil => Nil
    case Cons(x,Nil) => Nil
    case Cons(x,xs) => Cons(x, init(xs))
  }

  val list = List[Int](1,2,3,4,5,6)

  println("List : " + list)

  println("Drop 2 : " + init(list))

}
