package lists

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kamil on 21.10.14.
 */
class Problem18Spec extends FlatSpec with Matchers {
  import lists.Problem18._

  "slice" should "take a slice from list" in {
    slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be (List('d, 'e, 'f, 'g))
  }
}
