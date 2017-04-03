package demo

import creational.CircleUtils

/**
  * Created by kprzystalski on 01/04/17.
  */
object LazyInit {
  def main(args: Array[String]): Unit = {
    System.out.println(s"The basic area for a circle with radius 2.5 is ${CircleUtils.area(2.5)}")
    System.out.println(s"The precise area for a circle with radius 2.5 is ${CircleUtils.area(2.5, true)}")
    System.out.println(s"The basic area for a circle with radius 6.78 is ${CircleUtils.area(6.78)}")
    System.out.println(s"The precise area for a circle with radius 6.78 is ${CircleUtils.area(6.78, true)}")
  }
}
