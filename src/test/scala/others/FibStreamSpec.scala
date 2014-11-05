package others

import org.scalatest.FunSuite

/**
 * Created by T530 on 2014-10-28.
 */
class FibStreamSpec extends FunSuite {
  import others.FibStream._

  test("fibStream") {
    lazy val fib = fibStream()
    val elements: List[Int] = fib take 13 toList

    assert(elements == List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144))
  }

  test("fibStream2") {
    lazy val fib = fibStream2()
    val elements: List[Int] = fib take 13 toList

    assert(elements == List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144))
  }

}
