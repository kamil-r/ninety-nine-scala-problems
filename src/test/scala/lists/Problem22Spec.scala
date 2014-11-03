package lists

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kamil on 25.10.14.
 */
class Problem22Spec extends FlatSpec with Matchers {
  import lists.Problem22._

  "range" should "create range" in {
    range(4, 9) should be (List(4, 5, 6, 7, 8, 9))
    range(4, 3) should be (Nil)
    range(4, 4) should be (List(4))
  }

  "range2" should "create range" in {
    rangeBuildIn(4, 9) should be (List(4, 5, 6, 7, 8, 9))
    rangeBuildIn(4, 3) should be (Nil)
    rangeBuildIn(4, 4) should be (List(4))
  }

  "rangeFunctional" should "create range" in {
    rangeFunctional(4, 9) should be (List(4, 5, 6, 7, 8, 9))
    rangeFunctional(4, 3) should be (Nil)
    rangeFunctional(4, 4) should be (List(4))
  }
}
