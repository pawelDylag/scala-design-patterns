package demo

import creational.Authentication

/**
  * Created by kprzystalski on 01/04/17.
  */
object Singleton {
  def main(args: Array[String]): Unit = {
    System.out.println("I woke up.")
    Authentication.addUser("1", "Ivan")
    Authentication.addUser("2", "John")
    Authentication.addUser("3", "Martin")
    System.out.println(s"Is user with ID=1 registered? ${Authentication.isUserRegistered("1")}")
    System.out.println("Removing ID=2")
    Authentication.removeUser("2")
    System.out.println(s"Is user with ID=2 registered? ${Authentication.isUserRegistered("2")}")
    System.out.println(s"All users registered are: ${Authentication.getAllUserNames().mkString(",")}")
  }
}
