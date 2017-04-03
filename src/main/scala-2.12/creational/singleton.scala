package creational

/**
  * Created by kprzystalski on 01/04/17.
  */

import scala.collection.concurrent.TrieMap

object Authentication {
  System.out.println("Registry initialization block called.")
  private val users: TrieMap[String, String] = TrieMap.empty

  def addUser(id: String, name: String): Unit = {
    users.put(id, name)
  }

  def removeUser(id: String): Unit = {
    users.remove(id)
  }

  def isUserRegistered(id: String): Boolean = users.contains(id)

  def getAllUserNames(): List[String] = users.map(_._2).toList
}
