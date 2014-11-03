package lists

import org.scalatest.{FunSuite, GivenWhenThen}

/**
 * Created by kamil on 25.10.14.
 */
class Problem25Spec extends FunSuite with GivenWhenThen {
  import lists.Problem25._

  test("permutation") {
    Given("list")
    val inputList = List('a, 'b, 'c, 'd, 'e, 'f)
    When("run permutation")
    val resultList = randomPermute(inputList)
    Then("constraints should be held")
    assert(resultList.length == inputList.length)
    assert((resultList filter {inputList.contains(_)}).length == resultList.length)
    assert(resultList.groupBy(x => x).map(y => (y._1, y._2.length)) ==
      inputList.groupBy(x => x).map(y => (y._1, y._2.length)))
  }
}
