package arithmetic

/**
 * Created by kamil on 04.11.14.
 */
object Problem40 {
  implicit def toProblem40(n: Int) = new Problem40(n)
}

class Problem40(val n: Int) {
  import Problem39._
  import Problem35._

  def goldbach: (Int, Int) = {
    val primes = listPrimesInRange(2 to n)

    (for {
      x <- primes
      y <- primes
      if x + y == n
    } yield (x, y)).toSeq head
  }

  def goldbach2: Option[(Int, Int)] = {
    primes takeWhile { _ < n } find { p => (n - p).isPrime } match {
      case None => None
      case Some(p) => Some((p, n - p))
    }
  }
}
