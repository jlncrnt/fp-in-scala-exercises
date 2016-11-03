package Chapter3

object Exercise20 extends App {

  /**
    * Implement function filter
    */

  import Exercise8.foldRight
  import Exercise18.map
  import Exercise15.concatenate

  def flatMap[A,B](l: List[A])(f: A => List[B]): List[B] = concatenate(map(l)(e => f(e)))

  val list = List(1,2,3)

  println("Implement flatMap with the example given in the book : " + flatMap[Int,Int](list)(i => List(i,i)))

}
