package Chapter3

object Exercise17 extends App {

  /**
    * A function convert a list of double in a list of string
    */

  import Exercise08.foldRight

  def toStringList(l: List[Double]): List[String] = foldRight(l,Nil:List[String])((a,b) => Cons[String](a.toString,b))

  val list = List(1.0,2.0,3.0,4.0,5.0)

  println("Convert a list of double to a list of string : " + toStringList(list))

}
