import binary_trees.{Node, Empty, Tree}
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by T530 on 2014-11-13.
 */
class TreeSpec extends FlatSpec with Matchers {
  import Tree._

  "cBalanced" should "construct completely balanced binary trees for a given number of nodes" in {
    cBalanced(0, "x") should be (List(Empty))
    cBalanced(1, "x") should be (List(Node("x")))
    cBalanced(2, "x").toSet should be (Set(Node("x", Node("x"), Empty), Node("x", Empty, Node("x"))))
    cBalanced(3, "x") should be (List(Node("x", Node("x"), Node("x"))))
    cBalanced(4, "x").toSet should be (Set(
      Node("x", Node("x", Node("x"), Empty), Node("x")),
      Node("x", Node("x", Empty, Node("x")), Node("x")),
      Node("x", Node("x"), Node("x", Node("x"), Empty)),
      Node("x", Node("x"), Node("x", Empty, Node("x")))))
  }
}
