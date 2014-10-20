import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kamil on 20.10.14.
 */
class Problem14Spec extends FlatSpec with Matchers {
  import Problem14._

  "duplicate function" should "duplicate all the elements" in {
    duplicate(List('a, 'b, 'c, 'c, 'd)) should be (List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
    duplicate(List()) should be (List())
    duplicate(List(1, 1, 2)) should be (List(1, 1, 1, 1, 2, 2))
  }

}
