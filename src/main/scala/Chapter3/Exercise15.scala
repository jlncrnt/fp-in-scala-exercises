package Chapter3

object Exercise15 extends App {

  /**
    * Concatenate a list of two lists
    */

  import Exercise8.foldRight
  import Exercise2.tail
  import Exercise14.append

  def concatenate[T](ll: List[List[T]]): List[T] = ll match {
    case Nil => Nil
    case Cons(lh:List[T],lt:List[List[T]]) => append(lh, concatenate(lt))
  }

  //or

  def concatenate2[T](ll: List[List[T]]): List[T] = foldRight(ll, Nil:List[T])(append)

  val list1 = List(1, 2, 3, 4, 5)
  val list2 = List(6 ,7 ,8 ,9, 10)

  val listOfLists = List(list1, list2)

  println("Append List(6,7,8) to right of List(1,2,3,4,5) gives : " + concatenate(listOfLists))

}
