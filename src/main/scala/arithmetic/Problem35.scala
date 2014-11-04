package arithmetic

/**
 * Created by kamil on 03.11.14.
 */
object Problem35 {
  implicit def intToProblem35(n: Int): Problem35 = new Problem35(n)

  val primes = Stream.cons(2, Stream.from(3, 2) filter { _.isPrime })
}

class Problem35(val n: Int) {
  import Problem35._

  def isPrime: Boolean = {
    if (n <= 1) false
    else {
      primes takeWhile { _ <= Math.sqrt(n) } forall { n % _ != 0 }
    }
  }

  def primeFactors: List[Int] = {
    def findPrimeFactors(x: Int, acc: List[Int]): List[Int] = {
      if (x.isPrime) acc ++ List(x)
      else {
        val primeFactor = primes dropWhile { x % _ != 0 } head;
        findPrimeFactors(x / primeFactor, acc ++ List(primeFactor))
      }
    }
    findPrimeFactors(n, Nil)
  }
}
