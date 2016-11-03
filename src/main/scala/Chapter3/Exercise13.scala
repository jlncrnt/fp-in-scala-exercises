package Chapter3

object Exercise13 extends App {

  /**
    * Optional (Hard):
    * Implement foldLeft in terms of foldRight and foldRight in terms of foldLeft
    * Had to check the answer for this one...
    */

  import Exercise10.foldLeft

  def foldRightWithFoldLeft[A,B](l: List[A], z: B)(f: (A,B) => B) : B =
    foldLeft(l, (b:B) => b)((g,a) => b => g(f(a,b)))(z)

  import Exercise8.foldRight

  def foldLeftWithFoldRight[A,B](l: List[A], z: B)(f: (B,A) => B) : B =
    foldRight(l, (b:B) => b)((a,g) => b => g(f(b,a)))(z)

  val list = List(1,2,3,4,5)

  println("foldLeftWithFoldRight of List(1,2,3,4,5) with (_ + _) is : " + foldLeftWithFoldRight(list,0)(_ + _))
  println("foldRightWithFoldLeft of List(1,2,3,4,5) with (_ + _) is : " + foldRightWithFoldLeft(list,0)(_ + _))

}
