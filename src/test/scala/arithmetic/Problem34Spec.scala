package arithmetic

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by T530 on 2014-10-31.
 */
class Problem34Spec extends FlatSpec with Matchers {
  import Problem34._

  "phi" should "return Euler's totient" in {
    phi(10) should be (4)
    phi(7) should be (6)
    phi(9) should be (6)
  }
}
