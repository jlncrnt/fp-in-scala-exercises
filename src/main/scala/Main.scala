
/**
  * Created by julien on 01.11.16.
  */
object Main extends App {
  val arr = Array[Int](1,2,3,4,5,4)
  val ord = (a: Int, b: Int) => a < b
  println(Chapter2.Exercise2.isSorted(arr, ord))
}
