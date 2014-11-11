package binary_trees

/**
 * Created by kamil on 11.11.14.
 */
sealed abstract class Tree[+T]

case class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
  override def toString = "T(" + value + " " + left.toString + " " + right.toString + ")"
}

case object Empty extends Tree[Nothing] {
  override def toString = ""
}

object Node {
  def apply[T](value: T): Node[T] = Node(value, Empty, Empty)
}
