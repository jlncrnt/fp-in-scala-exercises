package Chapter4

/**
  * Created by julien on 08.11.16.
  */
object Exercise03 extends App {

  import scala.{Option => _, Either => _, _}
  import Chapter4.Exercise01.{None,Some,Option}

  trait OptionWithMap2[+T] extends Option[T] {

    // My implementation
    def myMap2[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = (a, b) match {
      case (_, None) => None
      case (None, _) => None
      case (Some(x), Some(y)) => Some(f(x, y))
        /** Avoid warning on compilation */
      case _ => throw new Exception("This should never happen")
    }

    // Answer
    def map2[A, B, C](a: Option[A], b: Option[B])(f: (A, B) => C): Option[C] = {
      // Extract value from a, extract value form b, call f on two values
      // Returns None if fails at any stage of the call "chain"
      a flatMap (av => b map (bv => f(av, bv)))
    }

  }

  object o extends OptionWithMap2[Any]

  val myt = o.map2(Some(1),Some(2.0))(_+_)
  val t = o.map2(Some(1),Some(2.0))(_+_)
  val myResult = myt.getOrElse(throw new Error("Cannot call f on args"))
  val result = t.getOrElse(throw new Error("Cannot call f on args"))

  println("My result : " + myResult)
  println("Correct answer : " + result)

}
