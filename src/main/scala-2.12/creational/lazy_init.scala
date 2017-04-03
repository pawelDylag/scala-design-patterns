package creational

import java.util.Properties

/**
  * Created by kprzystalski on 01/04/17.
  */
object CircleUtils {
  val basicPi = 3.14
  lazy val precisePi: Double = {
    System.out.println("Reading properties for the precise PI.")
    val props = new Properties()
    props.load(getClass.getResourceAsStream("pi.properties"))
    props.getProperty("pi.high").toDouble
  }

  def area(radius: Double, isPrecise: Boolean = false): Double = {
    val pi: Double = if (isPrecise) precisePi else basicPi
    pi * Math.pow(radius, 2)
  }
}
