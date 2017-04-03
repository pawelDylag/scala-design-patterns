package demo

import functional.Monoid

/**
  * Created by kprzystalski on 02/04/17.
  */



object Monoids {

  val stringConcatenation: Monoid[String] = new Monoid[String] {
    val zero: String = ""
    override def op(l: String, r: String): String = l + r
  }

  val intMultiplication: Monoid[Int] = new Monoid[Int] {
    val zero: Int = 1
    override def op(l: Int, r: Int): Int = l * r
  }

  def main(args: Array[String]): Unit = {
    val strings = List("This is\n", "a list of\n", "strings!")
    val numbers = List(1, 2, 3, 4, 5, 6)

    System.out.println(s"Left folded:\n ${strings.foldLeft(stringConcatenation.zero)(stringConcatenation.op)}")

    System.out.println(s"Right folded:\n ${strings.foldRight(stringConcatenation.zero)(stringConcatenation.op)}")

    System.out.println(s"6! is: ${numbers.foldLeft(intMultiplication.zero)(intMultiplication.op)}")
  }
}


