package arithmetic

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kamil on 04.11.14.
 */
class Problem39Spec extends FlatSpec with Matchers {
  import Problem39._

  "listPrimesInRange" should "Given a range of integers by its lower and upper limit, construct a list of all prime " +
    "numbers in that range" in {

    listPrimesInRange(7 to 31) should be (List(7, 11, 13, 17, 19, 23, 29, 31))
    listPrimesInRange(1 to 9) should be (List(2, 3, 5, 7))
  }
}
