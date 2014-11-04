package arithmetic

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kamil on 03.11.14.
 */
class Problem35Spec extends FlatSpec with Matchers {
  import Problem35._

  "primeFactors" should "return a flat list containing the prime factors in ascending order" in {
    315.primeFactors should be (List(3, 3, 5, 7))
    8.primeFactors should be (List(2, 2, 2))
    21.primeFactors should be (List(3, 7))
    9.primeFactors should be (List(3, 3))
    7.primeFactors should be (List(7))
  }
}
