package arithmetic

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by T530 on 2014-11-04.
 */
class Problem37Spec extends FlatSpec with Matchers {
  import Problem37._

  "phi" should "compute Euler's totient function" in {
    phi(10) should be (4)
    phi(7) should be (6)
    phi(9) should be (6)
  }
}
