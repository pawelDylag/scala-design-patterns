package structural

import scala.collection.mutable.ListBuffer

/**
  * Created by kprzystalski on 01/04/17.
  */
trait Node {
  def print(prefix: String): Unit
}

class Leaf(data: String) extends Node {
  override def print(prefix: String): Unit =
    System.out.println(s"${prefix}${data}")
}

class Tree extends Node {
  private val children = ListBuffer.empty[Node]

  override def print(prefix: String): Unit = {
    System.out.println(s"${prefix}(")
    children.foreach(_.print(s"${prefix}${prefix}"))
    System.out.println(s"${prefix})")
  }

  def add(child: Node): Unit = {
    children += child
  }

  def remove(): Unit = {
    if (children.nonEmpty) {
      children.remove(0)
    }
  }
}

