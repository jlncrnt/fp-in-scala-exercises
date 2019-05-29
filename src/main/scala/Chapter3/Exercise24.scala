package Chapter3

object Exercise24 extends App {

  /** (Hard)
    * Implement hasSubsequence
    */

  // Heavy... But official solution not very shorter
  def isRestComplete[T](l:List[T],m:List[T]): Boolean = (l,m) match {
    case (Cons(x,xs),Cons(y,ys)) => if(x == y) isRestComplete(xs,ys) else false
    case (_,Nil) => true
    case _ => false
  }

  def hasSubsequence[T](sup: List[T], sub: List[T]): Boolean = (sup,sub) match {
    case (Cons(x,xs),Cons(y,ys)) if x == y =>
      if (isRestComplete(xs,ys)) true else hasSubsequence(xs,Cons(y,ys))
    case (Cons(_,xs),Cons(y,ys)) => hasSubsequence(xs,Cons(y,ys))
    case _ => false
  }

  val sup = List(0,1,2,3,4,5)
  val sub = List(2,3,4)
  val sub2 = List(1,3,4)

  println("Does list List(1,2,3,4,5) has subsequence List(2,3,4) : " + hasSubsequence(sup,sub))
  println("Does list List(1,2,3,4,5) has subsequence List(1,3,4) : " + hasSubsequence(sup,sub2))

}
