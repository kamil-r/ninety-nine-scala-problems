package arithmetic

/**
 * Created by kamil on 03.11.14.
 */
object Problem36 {
  implicit def toProblem36(n: Int): Problem36 = new Problem36(n)
}

class Problem36(val n: Int) {
  import Problem35._

  def primeFactorMultiplicity: List[(Int,Int)] = {
    (n.primeFactors groupBy { x => x } map { case (x, list) => (x, list.length) } toList).sorted
  }

}


