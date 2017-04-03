package structural

/**
  * Created by kprzystalski on 01/04/17.
  */

class Logger {
  def log(message: String, severity: String): Unit = {
    System.out.println(s"${severity.toUpperCase}: $message")
  }
}

trait Log {
  def info(message: String)
  def debug(message: String)
  def warning(message: String)
  def error(message: String)
}

class AppLogger extends Logger with Log {
  override def info(message: String): Unit = log(message, "info")
  override def warning(message: String): Unit = log(message, "warning")
  override def error(message: String): Unit = log(message, "error")
  override def debug(message: String): Unit = log(message, "debug")
}

package object adapter {

  implicit class FinalAppLoggerImplicit(logger: AppLogger) extends Log {
    override def info(message: String): Unit = logger.log(message, "info")
    override def warning(message: String): Unit = logger.log(message, "warning")
    override def error(message: String): Unit = logger.log(message, "error")
    override def debug(message: String): Unit = logger.log(message, "debug")
  }
}