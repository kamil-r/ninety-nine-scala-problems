package codes

import scala.annotation.tailrec

/**
 * Created by kamil on 09.11.14.
 */
object Problem50 {

  private abstract sealed class Tree[A](val frequency: Int) {
    def toCode: List[(A, String)] = toCodePrefixed("")
    def toCodePrefixed(prefix: String): List[(A, String)]
  }

  private case class BranchNode[A](left: Tree[A], right: Tree[A]) extends Tree[A](left.frequency + right.frequency) {
    override def toCodePrefixed(prefix: String): List[(A, String)] =
      left.toCodePrefixed(prefix + "0") ++ right.toCodePrefixed(prefix + "1")
  }

  private case class Leaf[A](element: A, freq: Int) extends Tree[A](freq) {
    override def toCodePrefixed(prefix: String) = List((element, prefix))
  }

  def huffmanCode(symbols: List[(String, Int)]): List[(String, String)] = {
    @tailrec
    def huffmanRecursive[A](q: List[Tree[A]]): List[(A, String)] = q match {
      case Nil => Nil
      case List(x) => x toCodePrefixed ""
      case x1 :: x2 :: xs =>
        huffmanRecursive((new BranchNode(x1, x2) :: xs) sortWith(_.frequency < _.frequency))
    }
    huffmanRecursive(symbols sortWith { _._2 < _._2 } map { e => Leaf(e._1, e._2) })
  }
}
