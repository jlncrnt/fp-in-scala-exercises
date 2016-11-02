package Chapter3

/**
  * Julien 11.02.2016
  * "List" refers to impl. in this package
  */

object Exercise1 extends App {

  import List._

  /**
    * What will be the value of x ?
    * Answer : 3
    * @note Renamed variables in pattern to
    *       get rid of suspicious shadowing
    *       warning.
    */

  val x = List(1,2,3,4,5) match {
    case Cons(y, Cons(2, Cons(4, _))) => x
    case Nil => 42
    case Cons(y, Cons(z, Cons(3, Cons(4, _)))) => y + z
    case Cons(h, t) => h + sum(t)
    case _ => 101
  }

  println(s"The value of x is : $x")

}
