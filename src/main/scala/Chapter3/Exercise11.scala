package Chapter3

object Exercise11 extends App {

  /**
    * Write sum, product and length using foldLeft
    */

  import Exercise10.foldLeft

  def sum       (as: List[Int]) : Int = foldLeft(as,0)(_ + _)
  def product   (as: List[Int]) : Int = foldLeft(as,1)(_ * _)
  def length[A] (as: List[A])   : Int = foldLeft(as,0)((x,_) => x + 1)

  val list = List(1,2,3,4,5)

  println("sum of List(1,2,3,4,5) is : " + sum(list))
  println("product of List(1,2,3,4,5) is : " + product(list))
  println("length of List(1,2,3,4,5) is : " + length(list))

}
