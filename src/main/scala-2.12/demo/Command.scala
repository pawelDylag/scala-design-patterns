package demo

import behavioral._

/**
  * Created by kprzystalski on 01/04/17.
  */
object Command {
  def main(args: Array[String]): Unit = {
    val robot = Robot()
    val robotController = new RobotController

    robotController.issueCommand(MakeSandwichCommand(robot))
    robotController.issueCommand(PourJuiceCommand(robot))
    System.out.println("I'm eating and having some juice.")
    robotController.issueCommand(CleanUpCommand(robot))

    System.out.println("Here is what I asked my robot to do:")
    robotController.showHistory()
  }
}
