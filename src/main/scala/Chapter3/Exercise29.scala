package Chapter3

object Exercise29 extends App {

  /**
    * Generalize former exercises by writing a fold function for the tree
    */

  // My solution
  def fold[A](tree: Tree[A])(f: (A,A) => A): A = tree match {
    case Branch(l,r) => f(fold(l)(f),fold(r)(f))
    case Leaf(v) => v
  }

  //fpinscala solution allow returning another fold type
  def fold2[A,B](tree: Tree[A])(f: A => B)(g: (B,B) => B): B = tree match {
    case Branch(l,r) => g(fold2(l)(f)(g),fold2(r)(f)(g))
    case Leaf(v) => f(v)
  }

  val tree: Tree[Int] = Branch(Leaf(1),Branch(Leaf(2),Leaf(3)))

  println("The folded tree is : " + fold(tree)(_ + _))
  println("The folded tree is : " + fold2(tree)(identity)(_ + _))

}
