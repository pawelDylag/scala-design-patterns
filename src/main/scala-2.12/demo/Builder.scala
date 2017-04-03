package demo

/**
  * Created by kprzystalski on 01/04/17.
  */

import creational.PersonBuilder

object Builder {
  def main(args: Array[String]): Unit = {
    val person = PersonBuilder()
      .setFirstName("Student")
      .setLastName("Studencki")
      .setAge(26)
      .build()
    System.out.println(s"Person: ${person.firstName} ${person.lastName}. Age: ${person.age}.")
  }
}
