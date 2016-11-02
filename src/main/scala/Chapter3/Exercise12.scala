package Chapter3

object Exercise12 extends App {

  /**
    * Write reverse function using a fold
    */

  import Exercise8.foldRight
  import Exercise10.foldLeft

  def reverse[T](l: List[T]): List[T] = foldLeft(l, Nil:List[T])((l, e) => Cons(e,l))

  val list = List(1, 2, 3, 4, 5)

  println("reverse of List(1,2,3,4,5) is : " + reverse(list))

}
