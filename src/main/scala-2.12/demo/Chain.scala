package demo

import behavioral.{Money, PartialFunctionATM}

import scala.io.Source

/**
  * Created by kprzystalski on 02/04/17.
  */
object Chain {
  def main(args: Array[String]): Unit = {
    val atm = new PartialFunctionATM
    printHelp()
    Source.stdin.getLines().foreach {
      case line =>
        processLine(line, atm)
    }
  }

  def printHelp(): Unit = {
    System.out.println("Usage: ")
    System.out.println("1. Write an amount to withdraw...")
    System.out.println("2. Write EXIT to quit the application.")
  }

  def processLine(line: String, atm: PartialFunctionATM): Unit = {
    line match {
      case "EXIT" =>
        System.out.println("Bye!")
        System.exit(0)
      case l =>
        try {
          atm.requestMoney(Money(l.toInt))
          System.out.println("Thanks!")
        } catch {
          case _: Throwable =>
            System.err.println(s"Invalid input: $l.")
            printHelp()
        }

    }
  }
}
