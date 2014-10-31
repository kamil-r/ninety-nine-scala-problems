package lists

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kamil on 25.10.14.
 */
class Problem21Spec extends FlatSpec with Matchers {
  import lists.Problem21._

  "insertAt" should "insert at given position" in {
    insertAt('new, 1, List('a, 'b, 'c, 'd)) should be (Some(List('a, 'new, 'b, 'c, 'd)))
  }

  "insertAt2" should "insert at given position" in {
    insertAt2('new, 1, List('a, 'b, 'c, 'd)) should be (List('a, 'new, 'b, 'c, 'd))
  }

}
