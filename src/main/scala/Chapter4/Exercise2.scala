package Chapter4

/**
  * Implement variance in terms of flatmap
  */
object Exercise2 extends App {

  import scala.{Option => _, Either => _, _}
  import Chapter4.Exercise1.{None, Some}

  trait OptionWithVariance[+A] extends Option[A] {
    def mean(s: Seq[Double]): Option[Double] = if(s.isEmpty) None else Some(s.sum / s.size)
    def variance(s: Seq[Double]): Option[Double] = {
      val fm: Double => Option[Double] =
        m => mean(s.map(x => math.pow(x - m, 2)))
      // For this mean, flatMap extract the value
      // and use it in the variance def.
      mean(s) flatMap fm
    }
  }

  object o extends OptionWithVariance[Any]

  println(o.variance(Seq(1.1,2.2,3.3,4.0)))

}

