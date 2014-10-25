import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by kamil on 25.10.14.
 */
class Problem23Spec extends FlatSpec with Matchers {
  import Problem23._

  "randomSelect" should "remove given number of random elements from list" in {
    val originalList = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val selected = randomSelect(3, originalList)
    assert(selected.size == 3)
    assert((selected filter {x => originalList.contains(x)}).size == 3)
  }
}
