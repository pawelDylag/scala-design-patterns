package behavioral

/**
  * Created by kprzystalski on 02/04/17.
  */


case class Money(amount: Int)

trait PartialFunctionDispenser {

  def dispense(dispenserAmount: Int): PartialFunction[Money, Money] = {
    case Money(amount) if amount >= dispenserAmount =>
      val notes = amount / dispenserAmount
      val left = amount % dispenserAmount
      System.out.println(s"Dispensing $notes note/s of $dispenserAmount.")
      Money(left)
    case m @ Money(amount) => m
  }
}

class PartialFunctionATM extends PartialFunctionDispenser {

  val dispenser = dispense(50).andThen(dispense(20)).andThen(dispense(10)).andThen(dispense(5))

  def requestMoney(money: Money): Unit = {
    if (money.amount % 5 != 0) {
      System.err.println("The smallest nominal is 5 and we cannot satisfy your request.")
    } else {
      dispenser(money)
    }
  }
}