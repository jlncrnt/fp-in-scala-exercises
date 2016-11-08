package Chapter4

/**
  * Created by julien on 08.11.16.
  */
object Exercise4 extends App {

  import scala.{Option => _, Either => _, _}
  import Chapter4.Exercise1.{Some,Option}

  trait OptionWithSequence[+A] extends Option[A] {

    def sequence[A](l: List[Option[A]]): Option[List[A]] = l match {
      case Nil => Some(Nil)
      case h::t => h flatMap (hv => sequence(t) map (sv => hv::sv))
    }
  }

  object o extends OptionWithSequence[Any]

  val r = o.sequence(List(Some(1),Some(2),Some(3)))

  println(r)

}

