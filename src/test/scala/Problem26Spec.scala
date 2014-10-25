import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kamil on 25.10.14.
 */
class Problem26Spec extends FlatSpec with Matchers {
  import Problem26._

  "combinations" should "create all the combination of a given length" in {
    val result = combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
    result should be (List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), List('a, 'b, 'f), List('a, 'c, 'd),
      List('a, 'c, 'e), List('a, 'c, 'f), List('a, 'd, 'e), List('a, 'd, 'f), List('a, 'e, 'f), List('b, 'c, 'd),
      List('b, 'c, 'e), List('b, 'c, 'f), List('b, 'd, 'e), List('b, 'd, 'f), List('b, 'e, 'f), List('c, 'd, 'e),
      List('c, 'd, 'f), List('c, 'e, 'f), List('d, 'e, 'f)))
  }

  it should "also work for shorter cases" in {
    combinations(1, List('a, 'b, 'c)) should be (List(List('a), List('b), List('c)))
    combinations(2, List('a, 'b, 'c)) should be (List(List('a, 'b), List('a, 'c), List('b, 'c)))
  }

  it should "yield result with empty list if n is zero or negative" in {
    combinations(0, List(1, 2, 3)) should be (List(Nil))
    combinations(-1, List(1, 2, 3)) should be (List(Nil))
  }

}
