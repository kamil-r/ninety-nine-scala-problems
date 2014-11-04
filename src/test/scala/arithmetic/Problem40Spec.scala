package arithmetic

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kamil on 04.11.14.
 */
class Problem40Spec extends FlatSpec with Matchers {
  import Problem40._

  //  Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers.
  // E.g. 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct
  // in the general case. It has been numerically confirmed up to very large numbers (much larger than Scala's Int
  // can represent).
  "goldbach" should "find the two prime numbers that sum up to a given even integer" in {
    28.goldbach should be ((5, 23))
  }

  "goldbach2" should "find the two prime numbers that sum up to a given even integer" in {
    28.goldbach2 should be (Some(5, 23))
    27.goldbach2 should be (None)
  }
}
