import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kamil on 20.10.14.
 */
class Problem15Spec extends FlatSpec with Matchers {
  import Problem15._

  "duplicate function" should "duplicate all the elements N times" in {
    duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should be (List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
    duplicateN(3, List()) should be (List())
    duplicateN(2, List(1, 1, 2)) should be (List(1, 1, 1, 1, 2, 2))
    duplicateN(0, List(1, 1, 2)) should be (List())
  }

}
