package Chapter3

object Exercise17 extends App {

  /**
    * A function convert a list of double in a list of string
    */

  import Exercise8.foldRight

  def toStringList(l: List[Double]): List[String] = foldRight(l,Nil:List[String])((a,b) => Cons[String](a.toString,b))

  val list = List(1.0,2.0,3.0,4.0,5.0)

  println("Append List(6,7,8) to right of List(1,2,3,4,5) gives : " + toStringList(list))

}
