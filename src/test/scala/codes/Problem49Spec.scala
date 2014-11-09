package codes

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kamil on 09.11.14.
 */
class Problem49Spec extends FlatSpec with Matchers {
  import Problem49._

  "grayCode" should "return an n-bit Gray code is a sequence of n-bit strings constructed according " +
    "to certain rules" in {

    grayCode(0) should be (List(""))
    grayCode(1) should be (List("0", "1"))
    grayCode(2) should be (List("00", "01", "11", "10"))
    grayCode(3) should be (List("000", "001", "011", "010", "110", "111", "101", "100"))
  }

  "grayCodeCached" should "return an n-bit Gray code is a sequence of n-bit strings constructed according " +
    "to certain rules" in {

    grayCodeCached(0) should be (List(""))
    grayCodeCached(1) should be (List("0", "1"))
    grayCodeCached(2) should be (List("00", "01", "11", "10"))
    grayCodeCached(3) should be (List("000", "001", "011", "010", "110", "111", "101", "100"))
  }

}
