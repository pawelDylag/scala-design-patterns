package demo

import structural.AppLogger

/**
  * Created by kprzystalski on 01/04/17.
  */

object Adapter {
  def main(args: Array[String]): Unit = {
    val logger = new AppLogger
    logger.info("This is an info message.")
    logger.debug("Debug something here.")
    logger.error("Show an error message.")
    logger.warning("About to finish.")
    logger.info("Bye!")
  }
}
