package arithmetic

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by T530 on 2014-10-29.
 */
class Problem31Spec extends FlatSpec with Matchers {
  import Problem31._

  "isPrime" should "distinguish prime numbers" in {
    isPrime(2) should be (true)
    isPrime(3) should be (true)
    isPrime(5) should be (true)
    isPrime(7) should be (true)
    isPrime(11) should be (true)
    isPrime(89) should be (true)

    isPrime(4) should be (false)
    isPrime(9) should be (false)
    isPrime(87) should be (false)
  }

  "isPrime2" should "distinguish prime numbers" in {
    isPrime2(2) should be (true)
    isPrime2(3) should be (true)
    isPrime2(5) should be (true)
    isPrime2(7) should be (true)
    isPrime2(11) should be (true)
    isPrime2(89) should be (true)

    isPrime2(4) should be (false)
    isPrime2(9) should be (false)
    isPrime2(87) should be (false)
  }

}
