package binary_trees

/**
 * Created by kamil on 11.11.14.
 */
sealed abstract class Tree[+T] {
  def isMirrorOf[T](other: Tree[T]): Boolean
  def isSymmetric: Boolean
  def addValue[U >: T <% Ordered[U]](element: U): Tree[U]
}

case object Empty extends Tree[Nothing] {
  override def toString = "."
  override def isMirrorOf[T](other: Tree[T]): Boolean = other == Empty
  override def isSymmetric: Boolean = true
  override def addValue[U <% Ordered[U]](element: U): Tree[U] = Node(element)
}

case class Node[+T](value: T, left: Tree[T], right: Tree[T]) extends Tree[T] {
  override def toString = "T(" + value + " " + left.toString + " " + right.toString + ")"

  override def isMirrorOf[T](other: Tree[T]): Boolean = other match {
    case node: Node[T] => left.isMirrorOf(node.right) && right.isMirrorOf(node.left)
    case _ => false
  }

  override def isSymmetric: Boolean = left isMirrorOf right

  override def addValue[U >: T <% Ordered[U]](element: U): Tree[U] = {
    if (value == element) this
    else if (value < element) Node(value, left, right.addValue(element))
    else Node(value, left.addValue(element), right)
  }
}

object Node {
  def apply[T](value: T): Node[T] = Node(value, Empty, Empty)
}

object Tree {
  /**
   * Constructs completely balanced binary trees for a given number of nodes (in a completely balanced binary tree,
   * the following property holds for every node: the number of nodes in its left subtree and the number of nodes in
   * its right subtree are almost equal, which means their difference is not greater than one).
   * The function should generate all solutions.
   */
  def cBalanced[T](nodes: Int, value: T): List[Tree[T]] = nodes match {
    case 0 => List(Empty)
    case n if n % 2 == 1 => {
      val subTree = cBalanced(n / 2, value)
      for {
        left <- subTree
        right <- subTree
      } yield Node(value, left, right)
    }
    case n if n % 2 == 0 => {
      val subTreeLesser = cBalanced((n - 1) / 2, value)
      val subTreeGreater = cBalanced((n - 1) / 2 + 1, value)
      // subTreeLesser flatMap { t1 => subTreeGreater flatMap { t2 => List(Node(value, t1, t2), Node(value, t2, t1))} }
      (for {
        first <- subTreeLesser
        second <- subTreeGreater
      } yield List(Node(value, first, second), Node(value, second, first))).flatten
    }
  }

  def symmetricBalancedTrees[T](nodes: Int, value: T): List[Tree[T]] =
    cBalanced(nodes, value) filter { _.isSymmetric }

  /**
   * In a height-balanced binary tree, the following property holds for every node: The height of its left subtree and
   * the height of its right subtree are almost equal, which means their difference is not greater than one.
   * Method constructs height-balanced binary trees for a given height with a supplied value for the nodes.
   * The function generates all solutions.
   */
  def hBalanced[T](height: Int, value: T): List[Tree[T]] = height match {
    case 0 => List(Empty)
    case 1 => List(Node(value))
    case _ => {
      val higherSubTree = hBalanced(height - 1, value)
      val lowerSubTree = hBalanced(height - 2, value)
      (for {
        lower <- lowerSubTree
        higher <- higherSubTree
      } yield List(Node(value, higher, higher), Node(value, higher, lower), Node(value, lower, higher))).flatten
    }
  }

  def fromList[T <% Ordered[T]](elements: List[T]): Tree[T] =
    elements.foldLeft(Empty: Tree[T])((acc, el) => acc.addValue(el))
}
