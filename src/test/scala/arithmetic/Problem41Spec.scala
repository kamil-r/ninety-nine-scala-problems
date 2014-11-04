package arithmetic

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kamil on 04.11.14.
 */
class Problem41Spec extends FlatSpec with Matchers {
  import Problem41._

  "getGoldbachList" should "given a range of integers by its lower and upper limit, return a list of all even numbers" +
    "and their Goldbach composition" in {

    getGoldbachList(9 to 20) should be (List(
      (10, (3, 7)),
      (12, (5, 7)),
      (14, (3, 11)),
      (16, (3, 13)),
      (18, (5, 13)),
      (20, (3, 17))))
  }

  // In most cases, if an even number is written as the sum of two prime numbers, one of them is very small.
  // Very rarely, the primes are both bigger than, say, 50.
  "getGoldbachListLimited" should "given a range of integers by its lower and upper limit, return a list of all " +
    "even numbers and their Goldbach composition when both primes are greater or equal to given threshold" in {

    getGoldbachListLimited(3 to 2000, 50) should be (List(
      (992, (73, 919)),
      (1382, (61, 1321)),
      (1856, (67, 1789)),
      (1928, (61, 1867))))
  }
}
