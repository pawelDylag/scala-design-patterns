package demo

import behavioral.{Group, School, Student}

/**
  * Created by kprzystalski on 02/04/17.
  */
object Mediator {
  def main(args: Array[String]): Unit = {
    val school = new School
    // create students
    val student1 = Student("Janek", 26)
    val student2 = Student("Zosia", 26)
    val student3 = Student("Ania", 25)
    // create groups
    val group1 = Group("Scala design patterns")
    val group2 = Group("Databases")
    val group3 = Group("Cloud computing")

    school.addStudentToGroup(student1, group1)
    school.addStudentToGroup(student1, group2)
    school.addStudentToGroup(student1, group3)

    school.addStudentToGroup(student2, group1)
    school.addStudentToGroup(student2, group3)

    school.addStudentToGroup(student3, group1)
    school.addStudentToGroup(student3, group2)

    // notify
    school.notifyStudentsInGroup(group1, "Design patterns in Scala are amazing!")

    // see groups
    System.out.println(s"$student3 is in groups: ${school.getGroupsForStudent(student3)}")
    // remove from group
    school.removeStudentFromGroup(student3, group2)
    System.out.println(s"$student3 is in groups: ${school.getGroupsForStudent(student3)}")

    // see students in group
    System.out.println(s"Students in $group1 are ${school.getStudentsInGroup(group1)}")
  }
}
