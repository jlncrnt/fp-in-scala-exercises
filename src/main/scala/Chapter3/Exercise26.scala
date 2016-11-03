package Chapter3

object Exercise26 extends App {

  /**
    * Write a function that counts the number of nodes in a tree
    */

  def maximum(tree: Tree[Int]): Int = tree match {
    case Branch(l,r) => maximum(l) max maximum(r)
    case Leaf(v) => v
  }

  val tree = Branch(Leaf(1),Branch(Leaf(2),Leaf(3)))

  println("The maximum value in the tree is : " + maximum(tree))

}
