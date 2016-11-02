package Chapter3

object Exercise7 extends App {

  /**
    * Product cannot halts the recursion, since foldRight
    * is not tail recursive. The call to itself is not the
    * last operation of the recursion, it still have to multiply
    * the return by the value in the outer recursion.
    */

}
