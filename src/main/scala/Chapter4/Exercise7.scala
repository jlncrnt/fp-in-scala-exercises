package Chapter4

/**
  * Created by julien on 08.11.16.
  * Implement version of map, flatMap, orElse and map2 for Either
  * that opertate on the Right value
  */
object Exercise7 extends App {
  /*
    import scala.{Option => _, Either => _, _}
    import Chapter4.Exercise6.{Right,Either}

    trait EitherWithSequenceAndTravers[+E,+A] extends Either[E,A] {


      // Is implemented like so in official answer
      def sequence[EE >: E,B](es: List[Either[EE,B]]): Either[EE,List[B]] = traverse(es)(identity)

      def traverse[EE >: E,B,C](es: List[B])(f: B => Either[EE,C]): Either[EE, List[C]] = es match {
        case Nil => Right(Nil)
        case h::t => (f(h) map2 traverse(t)(f))(_::_)
      }

    }

   */
}
