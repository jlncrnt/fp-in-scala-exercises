package Chapter3

object Exercise23 extends App {

  /**
    * Implement zipWith
    */

  def zipWith[A,B,C](l: List[A],m: List[B])(f: (A,B) => C): List[C] = (l,m) match {
    case (Nil, _) => Nil
    case (_, Nil) => Nil
    case (
      Cons(x, xs),
      Cons(y, ys)
    ) => Cons(f(x, y), zipWith(xs, ys)(f))
  }

  val l = List(1,2,3)
  val m = List(4,5,6)

  println("Zip two lists with _ + _ : " + zipWith(l,m)(_ + _))

}
