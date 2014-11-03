package arithmetic

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by T530 on 2014-10-31.
 */
class Problem33Spec extends FlatSpec with Matchers {
  import Problem33._

  "areComrpime" should "check greatest common divisor for two numbers is 1" in {
    areComprise(3, 7) should be (true)
    areComprise(3, 8) should be (true)
    areComprise(6, 9) should be (false)
  }
}
