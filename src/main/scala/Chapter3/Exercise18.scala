package Chapter3

object Exercise18 extends App {

  /**
    * Implement function Map
    */

  import Exercise08.foldRight

  def map[A,B](l: List[A])(f: A => B): List[B] = foldRight(l,Nil:List[B])((a,b) => Cons[B](f(a),b))

  val list = List(1.0,2.0,3.0,4.0,5.0)

  println("Map a function to a list : " + map[Double,Double](list)(_ * 2))

}
