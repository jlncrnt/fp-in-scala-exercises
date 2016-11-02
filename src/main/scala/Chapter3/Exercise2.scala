package Chapter3

/**
  * Julien 11.02.2016
  * "List" refers to impl. in this package
  */

object Exercise2 extends App {

  /**
    * Implement function tail such as it takes constant time.
    * Make all in a class so we can extend it in further exercises.
    * Explicitly indicate package in extend to avoid confusion.
    */

  trait Get[+A] extends Chapter3.List[A]

  object Get {

    def tail[T](as: List[T]): List[T] = as match {
      case Nil => throw new Error("Tail of empty list")
      case Cons(x, xs) => xs
    }

  }

  val list = List(1,2,3,4,5,6,7,8,9,10)

  println("List : " + list)

  println("Tail : " + Get.tail(list))

}
