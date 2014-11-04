package arithmetic

/**
 * Created by kamil on 04.11.14.
 */
object Problem39 {
  import Problem35._

  def listPrimesInRange(start: Int, end: Int): List[Int] =
    listPrimesInRange(start to end)

  def listPrimesInRange(range: Range): List[Int] = {
    primes dropWhile { _ < range.head } takeWhile { _ <= range.last } toList
  }

}
