package Chapter3

object Exercise21 extends App {

  /**
    * Use flatMap to implement filter
    */

  import Exercise20.flatMap

  def filterWithFlatMap[T](l: List[T])(f: T => Boolean): List[T] = flatMap(l)(e => if(f(e)) List(e) else Nil)

  val list = List(1,2,3,4,5,6,7)

  println("Filter with flatmap: " + filterWithFlatMap(list)(_ > 2))

}
