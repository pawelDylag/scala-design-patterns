package behavioral

import scala.collection.mutable.ListBuffer

/**
  * Created by kprzystalski on 01/04/17.
  */


case class Robot() {
  def cleanUp(): Unit = System.out.println("Cleaning up.")

  def pourJuice(): Unit = System.out.println("Pouring juice.")

  def makeSandwich(): Unit = System.out.println("Making a sandwich.")
}

trait RobotCommand {
  def execute(): Unit
}

case class MakeSandwichCommand(robot: Robot) extends RobotCommand {
  override def execute(): Unit = robot.makeSandwich()
}

case class PourJuiceCommand(robot: Robot) extends RobotCommand {
  override def execute(): Unit = robot.pourJuice()
}

case class CleanUpCommand(robot: Robot) extends RobotCommand {
  override def execute(): Unit = robot.cleanUp()
}

class RobotController {
  val history = ListBuffer[RobotCommand]()

  def issueCommand(command: RobotCommand): Unit = {
    command +=: history
    command.execute()
  }

  def showHistory(): Unit = {
    history.foreach(println)
  }
}

