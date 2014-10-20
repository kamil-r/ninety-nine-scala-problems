import org.scalatest.{BeforeAndAfter, FlatSpec, Matchers}

/**
 * Created by kamil on 19.10.14.
 */
class Problem3Spec extends FlatSpec with Matchers {
  import Problem3.nth

  val list = List(1,2,5)

  "nth function" should "return nth element" in {
    nth(0, list) should be (1)
    nth(2, list) should be (5)
  }

  it should "throw IllegalArgumentException if a list is empty" in {
    a [IllegalArgumentException] should be thrownBy {
      nth(0, Nil)
    }
  }

  it should "throw IllegalArgumentException if a index > list.length" in {
    a [IllegalArgumentException] should be thrownBy {
      nth(99, list)
    }
  }
}
