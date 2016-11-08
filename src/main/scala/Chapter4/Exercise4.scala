package Chapter4

/**
  * Created by julien on 08.11.16.
  */
object Exercise4 extends App {

  import Exercise1._

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

