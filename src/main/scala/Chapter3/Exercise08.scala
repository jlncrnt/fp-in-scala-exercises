package Chapter3

object Exercise08 extends App {

  println()
  println(""" | It will build a list, calling Cons on each element
              | with the rest of the list as second argument.
              | So the resulting list is structurally the same
              | as the one passed in argument.
              | """.stripMargin)

  def foldRight[A,B](as: List[A], z: B)(f: (A,B) => B) : B = as match {
    case Nil => z
    case Cons(x,xs) => f(x, foldRight(xs,z)(f))
  }

  val list = List(1,2,3)
  val res = foldRight(list, Nil:List[Int])(Cons(_,_))

  val isSame = list match {
    case `res` => true
    case _ => false
  }

  println("Folded-right list result structurally equals its argument : " + isSame)

}
