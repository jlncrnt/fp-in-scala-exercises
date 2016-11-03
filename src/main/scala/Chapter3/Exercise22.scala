package Chapter3

object Exercise22 extends App {

  /**
    * Write a function that add corresponding element of two list, returning a List.
    */

  // My solution. May not be the best. Return pairwise with shortest list.
  def addTwoLists[T](l: List[T],m: List[T]): List[Int] = Cons(l,m) match {
    case Cons(
      Cons(x:Int,xs),
      Cons(y:Int,ys)
    ) => Cons(x+y, addTwoLists(xs,ys))
    case _ => Nil
  }

  val l = List(1,2,3)
  val m = List(4,5,6)

  println("Add two lists: " + addTwoLists(l,m))

}
