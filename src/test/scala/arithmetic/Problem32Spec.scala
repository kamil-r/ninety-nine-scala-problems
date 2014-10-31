package arithmetic

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by T530 on 2014-10-31.
 */
class Problem32Spec extends FlatSpec with Matchers {
  import Problem32._

  "gcdDivide" should "return greates common divisor" in {
    gcdDivide(36, 63) should be (9)
    gcdDivide(63, 36) should be (9)
    gcdDivide(7, 21) should be (7)
    gcdDivide(144, 23) should be (1)
  }

  "gcdDivide2" should "return greates common divisor" in {
    gcdDivide2(36, 63) should be (9)
    gcdDivide2(63, 36) should be (9)
    gcdDivide2(7, 21) should be (7)
    gcdDivide2(144, 23) should be (1)
  }

  "gcdSubstract" should "return greates common divisor" in {
    gcdSubstract(36, 63) should be (9)
    gcdSubstract(63, 36) should be (9)
    gcdSubstract(7, 21) should be (7)
    gcdSubstract(144, 23) should be (1)
  }

}
