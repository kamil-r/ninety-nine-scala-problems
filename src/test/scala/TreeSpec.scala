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

  "isSymetric" should "check whether a given binary tree is symmetric" in {
    Empty.isSymmetric should be (true)
    Node("x").isSymmetric should be (true)
    Node("x", Node("y"), Node("z")).isSymmetric should be (true)
    Node("x", Node("y"), Empty).isSymmetric should be (false)
    Node("x", Empty, Node("y")).isSymmetric should be (false)
  }

  "addValue" should "create new tree containing value" in {
    Tree.fromList(List(5, 3, 18, 1, 4, 12, 21)).isSymmetric should be (true)
    Tree.fromList(List(3, 2, 5, 7, 4)).isSymmetric should be (false)
  }

  "symmetricBalancedTrees" should "construct all symmetric, completely balanced binary trees with a given number of nodes" in {
    symmetricBalancedTrees(5, "x").toSet should be (Set(
      Node("x", Node("x", Node("x"), Empty), Node("x", Empty, Node("x"))),
      Node("x", Node("x", Empty, Node("x")), Node("x", Node("x"), Empty))))
  }

  "hBalanced" should "construct height-balanced binary trees for a given height with a supplied value for the nodes" in {
    hBalanced(0, "x") should be (List(Empty))
    hBalanced(1, "x") should be (List(Node("x")))
    hBalanced(2, "x").toSet should be (Set(
      Node("x", Node("x"), Node("x")),
      Node("x", Node("x"), Empty),
      Node("x", Empty, Node("x"))))
    hBalanced(3, "x").toSet should be (Set(
      Node("x", Node("x", Node("x"), Empty), Node("x")),
      Node("x", Node("x", Node("x"), Empty), Node("x", Node("x"), Empty)),
      Node("x", Node("x", Node("x"), Empty), Node("x", Empty, Node("x"))),
      Node("x", Node("x", Node("x"), Empty), Node("x", Node("x"), Node("x"))),
      Node("x", Node("x", Empty, Node("x")), Node("x")),
      Node("x", Node("x", Empty, Node("x")), Node("x", Node("x"), Empty)),
      Node("x", Node("x", Empty, Node("x")), Node("x", Empty, Node("x"))),
      Node("x", Node("x", Empty, Node("x")), Node("x", Node("x"), Node("x"))),
      Node("x", Node("x", Node("x"), Node("x")), Node("x")),
      Node("x", Node("x", Node("x"), Node("x")), Node("x", Node("x"), Empty)),
      Node("x", Node("x", Node("x"), Node("x")), Node("x", Empty, Node("x"))),
      Node("x", Node("x", Node("x"), Node("x")), Node("x", Node("x"), Node("x"))),
      Node("x", Node("x"), Node("x", Node("x"), Empty)),
      Node("x", Node("x"), Node("x", Empty, Node("x"))),
      Node("x", Node("x"), Node("x", Node("x"), Node("x")))))
  }

  "size" should "return number of nodes in tree" in {
    Empty.size should be (0)
    Node("x").size should be (1)
    Node("x", Empty, Node("x", Node("x", Empty), Empty)).size should be (3)
  }

  "minHbalNodes" should "return number of nodes of a minimal height-balanced tree" in {
    minHbalNodes(0) should be (0)
    minHbalNodes(1) should be (1)
    minHbalNodes(2) should be (2)
    minHbalNodes(3) should be (4)
    ((4 to 5) flatMap { h =>
        hBalanced(h, "x").sortWith(_.size < _.size).take(1)
      }).foreach({ t =>
        minHbalNodes(t.height) should be (t.size)
      })
  }
}
