package Chapter3

object Exercise16 extends App {

  /**
    * A function that adds 1 to every element of a list
    */

  import Exercise8.foldRight

  def addOne(l: List[Int]): List[Int] = foldRight(l,Nil:List[Int])((a,b) => Cons(a+1,b))

  val list = List(1, 2, 3, 4, 5)

  println("Append List(6,7,8) to right of List(1,2,3,4,5) gives : " + addOne(list))

}
