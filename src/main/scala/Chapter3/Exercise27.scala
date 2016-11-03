package Chapter3

object Exercise27 extends App {

  /**
    * Write a function return the maximum path length in a tree
    */

  def depth[A](tree: Tree[A], n: Int): Int = tree match {
    case Branch(l,r) => depth(l,n+1) max depth(r,n+1)
    case Leaf(v) => n
  }

  val tree = Branch(Leaf(1),Branch(Leaf(2),Leaf(3)))

  println("The maximum depth in the tree is : " + depth(tree,0))

}
