package arithmetic

/**
 * Created by Kamil on 2014-10-29.
 */
object Problem31 {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    def checkForPrime(x: Int): Boolean = x match {
      case x1 if x1 > math.sqrt(n) => true
      case x1 => if (n % x1 == 0) false else checkForPrime(x + 1)
    }
    checkForPrime(2)
  }

  def isPrime2(n: Int): Boolean = {
    if (n <= 1) false
    else {
      stream takeWhile { _ <= math.sqrt(n) } forall { n % _ != 0 }
    }
  }

  private val stream = 2 #:: (Stream.from(3, 2) filter { isPrime2 _ })

}
