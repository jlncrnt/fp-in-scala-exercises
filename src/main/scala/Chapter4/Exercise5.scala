package Chapter4

/**
  * Created by julien on 08.11.16.
  * Implement function traverse
  */
object Exercise5 extends App {

  import Exercise1._
  import Exercise3._

  trait OptionWithTraverse[+A] extends OptionWithMap2[A] {

    // Correct Answer
    def traverse[A, B](l: List[A])(f: A => Option[B]): Option[List[B]] = l match {
      case Nil => Some(Nil)
      case h :: t => map2(f(h), traverse(t)(f))(_ :: _)
    }
  }

  object o extends OptionWithTraverse[Any]

  val r = o.traverse(List(1,2,3,4,5))(x => Some(x + 1))

  println(r.getOrElse(throw new Error))
}
