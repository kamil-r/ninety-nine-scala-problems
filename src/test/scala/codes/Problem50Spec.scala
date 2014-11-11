package codes

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kamil on 11.11.14.
 */
class Problem50Spec extends FlatSpec with Matchers {
  import Problem50._

  "huffmanCode" should "construct a list of (S, C) Tuples, where C is the Huffman code word for the symbol S." in {
    huffmanCode(List(("a", 45), ("b", 13), ("c", 12), ("d", 16), ("e", 9), ("f", 5))).sortWith(_._1 < _._1) should
      be (List(("a","0"), ("b","101"), ("c","100"), ("d","111"), ("e","1101"), ("f","1100")))
  }

}
