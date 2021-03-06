package Chapter4


/**
  * Created by Julien on 08.11.16.
  * Implement version of map, flatMap, orElse and map2 for Either
  * that operate on the Right value
  */
object Exercise06 extends App {

  import scala.{Option => _, Either => _, _}

  trait Either[+E, +A] {
    def map[B](f: A => B): Either[E, B] = this match {
      case Right(a) => Right(f(a))
      case Left(e) => Left(e)
    }

    def flatMap[EE >: E, B](f: A => Either[EE, B]): Either[EE, B] = this match {
      case Right(a) => f(a)
      case Left(e) => Left(e)
    }

    def orElse[EE >: E, B >: A](b: => Either[EE, B]): Either[EE, B] = this match {
      case Right(a) => Right(a)
      case Left(_) => b
    }

    def myMap2[EE >: E, B, C](b: Either[EE, B])(f: (A, B) => C): Either[EE, C] =
      this flatMap (tv => b map (bv => f(tv, bv)))

    // Official answer
    def map2[EE >: E, B, C](b: Either[EE, B])(f: (A, B) => C): Either[EE, C] =
      for {a <- this; b1 <- b} yield f(a, b1)

    def Try[B](a: => B): Either[Exception, B] = try Right(a) catch {
      case e: Exception => Left(e)
    }
  }

  case class Left[+E](value: E) extends Either[E, Nothing]

  case class Right[+A](value: A) extends Either[Nothing, A]

}
