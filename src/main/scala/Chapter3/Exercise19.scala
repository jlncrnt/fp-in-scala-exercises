package Chapter3

object Exercise19 extends App {

  /**
    * Implement function filter
    */

  import Exercise8.foldRight

  def filter[T](l: List[T])(f: T => Boolean): List[T] = foldRight(l,Nil:List[T])((h,t) => if(f(h)) Cons[T](h,t) else t)

  val list = List(1.0,2.0,3.0,4.0,5.0)

  println("Filters element form a list : " + filter[Double](list)(_ > 2))

}
