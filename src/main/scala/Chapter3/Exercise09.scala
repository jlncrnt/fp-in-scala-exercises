package Chapter3

object Exercise09 extends App {

  /**
    * Compute the length of a list using foldRight
    */

  import Exercise08.foldRight

  def length[A](as: List[A]): Int = foldRight(as, 0)((_,x) => x + 1)

  val list = List(1,2,3,4,5)

  println("The length of list List(1,2,3,4,5) is " + length(list))

}
