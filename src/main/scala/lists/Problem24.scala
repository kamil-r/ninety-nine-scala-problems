package lists

import scala.annotation.tailrec
import scala.collection.immutable.Nil
import scala.util.Random

/**
 * Created by kamil on 25.10.14.
 */
object Problem24 {
  import lists.Problem23._

  def lottoTailRec(n: Int, maxRange: Int): List[Int] = {
    @tailrec
    def lotto(a: Int, random: Random, acc: List[Int]): List[Int] = {
      if (a <= 0) acc
      else {
        val next = random.nextInt(maxRange) + 1
        val (nextN, nextAcc) = if (acc.contains(next)) (a, acc) else (a-1, next :: acc)
        lotto(nextN, random, nextAcc)
      }
    }
    lotto(n, new Random(), Nil)
  }

  def lottoRandomSelect(n: Int, maxRange: Int) = {
    randomSelect(n, List.range(1, maxRange))
  }

}
