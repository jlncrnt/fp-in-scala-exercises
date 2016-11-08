package Chapter5

/**
  * Created by julien on 08.11.16.
  */
object Exercise2 extends App {

  import scala.annotation.tailrec
  import scala.{Stream => _}
  
  trait Stream[+A] {
    // My answer. As correction says, this is not tailrec
    def toList: List[A] = this match {
      case Empty => Nil
      case Cons(h,t) => h() :: t().toList
    }

    // Attempt at tailrec
    def toListTailRec: List[A] = {
      @tailrec
      def iter(s: Stream[A],acc: List[A]): List[A] = s match {
        case Empty => Nil
        case Cons(h,t) => iter(t(),h()::acc)
      }
      iter(this,Nil).reverse
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
      if (as.isEmpty) empty else cons(as.head, apply(as.tail: _*))
    }
  }

}
