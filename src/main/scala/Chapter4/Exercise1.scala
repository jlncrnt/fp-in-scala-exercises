package Chapter4

/**
  * Created by julien on 08.11.16.
  */
object Exercise1 extends App {
  trait Option[+A] {
    def map[B](f: A => B): Option[B] = this match {
      case Some(a) => Some(f(a))
      case None => None
    }
    def flatMap[B](f: A => Option[B]): Option[B] = this match {
      case Some(a) => f(a)
      case None => None
    }
    def getOrElse[B >: A](default: => B): B = this match {
      case Some(a) => a
      case None => default
    }
    def orElse[B >: A](ob: => Option[B]): Option[B] = this match {
      case _ => this
      case None => ob
    }
    def filter(f: A => Boolean): Option[A] = this match {
      case Some(a) if f(a) => this
      case _ => None
    }
1
  }
  case class Some[+A](get: A) extends Option[A]
  case object None extends Option[Nothing]
}
