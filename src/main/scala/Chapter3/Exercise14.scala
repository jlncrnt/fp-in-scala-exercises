package Chapter3

object Exercise14 extends App {

  /**
    * Implement append in terms of foldLeft or foldRight
    */

  import Exercise10.foldLeft
  import Exercise08.foldRight

  def append[T](l: List[T], e: List[T]): List[T] = foldRight(l, e)(Cons(_,_))

  val list = List(1, 2, 3, 4, 5)

  println("Append List(6,7,8) to right of List(1,2,3,4,5) gives : " + append(list,List(6,7,8)))

}
