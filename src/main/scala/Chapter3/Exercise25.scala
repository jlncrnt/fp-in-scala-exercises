package Chapter3

object Exercise25 extends App {

  /**
    * Write a function that counts the number of nodes in a tree
    */

  def countNodes[A](tree: Tree[A]): Int = tree match {
    case Branch(l,r) => countNodes(l) + countNodes(r)
    case Leaf(_) => 1
  }

  val tree = Branch(Leaf(1),Branch(Leaf(2),Leaf(3)))

  println("The number of node in the tree is : " + countNodes(tree))

}
