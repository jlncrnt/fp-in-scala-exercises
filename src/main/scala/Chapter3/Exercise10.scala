package Chapter3

object Exercise10 extends App {

  /**
    * Write the foldLeft function
    */

  def foldLeft[A,B](as: List[A], z: B)(f: (B,A) => B) : B = as match {
    case Nil => z
    case Cons(x,xs) => foldLeft(xs, f(z,x))(f)
  }

  val list = List(1,2,3,4,5)

  println("foldLeft of List(1,2,3,4,5) with (_ + _) is : " + foldLeft(list,0)(_ + _))

}
