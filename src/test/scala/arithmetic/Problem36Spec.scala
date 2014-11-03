package arithmetic

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kamil on 03.11.14.
 */
class Problem36Spec extends FlatSpec with Matchers {
  import Problem36._

  "primeFactorMultiplicity" should "construct a list containing the prime factors and their multiplicity" in {
    315.primeFactorMultiplicity should be (List((3,2), (5,1), (7,1)))
    8.primeFactorMultiplicity should be (List((2,3)))
    21.primeFactorMultiplicity should be (List((3,1), (7,1)))
    9.primeFactorMultiplicity should be (List((3, 2)))
    7.primeFactorMultiplicity should be (List((7,1)))
  }
}
