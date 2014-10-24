import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kamil on 25.10.14.
 */
class Problem20Spec extends FlatSpec with Matchers {
  import Problem20._

  "removeAt" should "remove element at given position" in {
    removeAt(1, List('a, 'b, 'c, 'd)) should be (Some((List('a, 'c, 'd),'b)))
    removeAt(-1, List('a, 'b, 'c, 'd)) should be (None)
    removeAt(1, List()) should be (None)
  }

  "removeAt2" should "remove element at given position" in {
    removeAt2(1, List('a, 'b, 'c, 'd)) should be (Some((List('a, 'c, 'd),'b)))
    removeAt2(-1, List('a, 'b, 'c, 'd)) should be (None)
    removeAt2(1, List()) should be (None)
  }
}
