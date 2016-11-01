package Chapter2

/**
  * Implements isSorted which checks if an
  * Array is sorted according to a given
  * comparison function
  */
object Exercise2 extends App {

  def isSorted[T](as: Array[T], ordered: (T, T) => Boolean): Boolean = as match {
    case Array(a, b) => ordered(a, b)
    case Array(a, b, _*) => if (!ordered(a, b)) false else isSorted(as.tail, ordered)
  }

  // IO side effect as last call
  val arr: Array[Int] = Array[Int](1, 2, 3, 5, 4, 6, 7, 8, 9)
  print(arr.mkString(","))
  println(" is sorted : " +
    isSorted[Int](
      arr,
      (a: Int, b: Int) => a < b
    )
  )

}
