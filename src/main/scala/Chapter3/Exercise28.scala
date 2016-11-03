package Chapter3

object Exercise28 extends App {

  /**
    * Write a map for a tree
    */

  def map[A,B](tree: Tree[A])(f: A => B): Tree[B] = tree match {
    case Branch(l,r) => Branch[B](map(l)(f),map(r)(f))
    case Leaf(v) => Leaf[B](f(v))
  }

  val tree = Branch(Leaf(1),Branch(Leaf(2),Leaf(3)))
  val mappedTree = map(tree)(_ + 10)

  println("The old tree is : " + Tree.print(tree))
  println("The new tree is : " + Tree.print(mappedTree))

}
