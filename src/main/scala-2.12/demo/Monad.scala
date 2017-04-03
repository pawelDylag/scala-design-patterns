package demo

import functional.Doer

/**
  * Created by kprzystalski on 02/04/17.
  */
object Monad {
  def main(args: Array[String]): Unit = {
    System.out.println(s"The result is: ${compute(Doer(), 10, 16)}")
  }

  def compute(doer: Doer, left: Int, right: Int): Int =
    if (doer != null) {
      val algorithm = doer.getAlgorithm(false)
      if (algorithm != null) {
        val implementation = algorithm.getImplementation(false, left, right)
        if (implementation !=  null) {
          implementation.compute
        } else {
          -1
        }
      } else {
        -1
      }
    } else {
      -1
    }
}