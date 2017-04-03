package behavioral

/**
  * Created by kprzystalski on 02/04/17.
  */

import scala.collection.mutable.Map
import scala.collection.mutable.Set

trait Notifiable {
  def notify(message: String)
}

case class Student(name: String, age: Int) extends Notifiable {
  override def notify(message: String): Unit = {
    System.out.println(s"Student $name was notified with message: '$message'.")
  }
}

case class Group(name: String)


trait Mediator {
  def addStudentToGroup(student: Student, group: Group)

  def isStudentInGroup(student: Student, group: Group): Boolean

  def removeStudentFromGroup(student: Student, group: Group)

  def getStudentsInGroup(group: Group): List[Student]

  def getGroupsForStudent(student: Student): List[Group]

  def notifyStudentsInGroup(group: Group, message: String)
}

class School extends Mediator {
  val studentsToGroups: Map[Student, Set[Group]] = Map()
  val groupsToStudents: Map[Group, Set[Student]] = Map()

  override def addStudentToGroup(student: Student, group: Group): Unit = {
    studentsToGroups.getOrElseUpdate(student, Set()) += group
    groupsToStudents.getOrElseUpdate(group, Set()) += student
  }

  override def isStudentInGroup(student: Student, group: Group): Boolean = groupsToStudents.getOrElse(group, Set()).contains(student) && studentsToGroups.getOrElse(student, Set()).contains(group)

  override def getStudentsInGroup(group: Group): List[Student] = groupsToStudents.getOrElse(group, Set()).toList

  override def getGroupsForStudent(student: Student): List[Group] = studentsToGroups.getOrElse(student, Set()).toList

  override def notifyStudentsInGroup(group: Group, message: String): Unit = {
    groupsToStudents.getOrElse(group, Set()).foreach(_.notify(message))
  }

  override def removeStudentFromGroup(student: Student, group: Group): Unit = {
    studentsToGroups.getOrElse(student, Set()) -= group
    groupsToStudents.getOrElse(group, Set()) -= student
  }
}