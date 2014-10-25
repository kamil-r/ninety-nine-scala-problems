import org.scalatest.{GivenWhenThen, FunSuite}

/**
 * Created by kamil on 25.10.14.
 */
class Problem24Spec extends FunSuite with GivenWhenThen {
  import Problem24._

  test("lottoTailRec") {
    Given("constraint")
    val maxRange = 49
    val total = 6
    When("lottoTailRec is run")
    val lottoRes = lottoTailRec(total, maxRange)
    Then("result should match range and count")
    assert(lottoRes.length == total)
    assert((lottoRes filter { x => x < 1 || x > maxRange}).length == 0)
    assert(lottoRes.length == lottoRes.toSet.size)
  }

  test("lottoRandomSelect") {
    Given("constraint")
    val maxRange = 49
    val total = 6
    When("lotto is run")
    val lottoRes = lottoRandomSelect(total, maxRange)
    Then("result should match range and count")
    assert(lottoRes.length == total)
    assert((lottoRes filter { x => x < 1 || x > maxRange}).length == 0)
    assert(lottoRes.length == lottoRes.toSet.size)
  }

}
