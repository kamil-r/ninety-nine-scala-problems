import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kamil on 21.10.14.
 */
class Problem16Spec extends FlatSpec with Matchers {
  import Problem16._

  "drop" should "drop every n-th element" in {
    drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be (List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
    drop(3, List(1, 2)) should be (List(1, 2))
    drop(3, List(1, 2, 3)) should be (List(1, 2))
  }

  "dropTailRecursive" should "drop every n-th element" in {
    dropTailRecursive(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be (List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
    dropTailRecursive(3, List(1, 2)) should be (List(1, 2))
    dropTailRecursive(3, List(1, 2, 3)) should be (List(1, 2))
  }

  "dropFunctional" should "drop every n-th element" in {
    dropFunctional(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be (List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
    dropFunctional(3, List(1, 2)) should be (List(1, 2))
    dropFunctional(3, List(1, 2, 3)) should be (List(1, 2))
  }

}
