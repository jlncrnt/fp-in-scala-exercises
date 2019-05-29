package Chapter5

/**
  * Created by julien on 08.11.16.
  */
object Exercise04 extends App {
  // Stream implementation

  trait Stream[+A] {

    def headOption: Option[A] = this match {
      case Empty => None
      case Cons(h,_) => Some(h())
    }

    def toList: List[A] = this match {
      case Empty => Nil
      case Cons(h, t) => h() :: t().toList
    }

    def take(n: Int): List[A] = this match {
      case Empty => Nil
      case Cons(h,t) if n  > 1 => h() :: t().take(n - 1)
      case Cons(h,t) if n == 1 => h() :: Nil
    }

    def takeWhile(p: A => Boolean): List[A] = this match {
      case Empty => Nil
      case Cons(h, t) if  p(h()) => h() :: t().takeWhile(p)
      case Cons(h, t) if !p(h()) => Nil
    }

  }

  case object Empty extends Stream[Nothing]
  case class Cons[+A](h: () => A, t: () => Stream[A]) extends Stream[A]

  object Stream {

    def cons[A](hd: => A, tl: => Stream[A]): Stream[A] = {
      lazy val head = hd
      lazy val tail = tl
      Cons(() => head, () => tail)
    }

    def empty[A]: Stream[A] = Empty

    def apply[A](as: A*): Stream[A] = {
      if(as.isEmpty) empty else cons(as.head, apply(as.tail: _*))
    }

  }

  Stream(1,2,3).takeWhile(_ < 3)
  
}
