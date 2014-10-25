import scala.annotation.tailrec
import scala.collection.immutable.Nil
import scala.util.Random

/**
 * Created by kamil on 25.10.14.
 */
object Problem24 {

  def lotto(n: Int, maxRange: Int): List[Int] = {
    if (n <= 0) Nil
    else {
      val random = new Random().nextInt(maxRange) + 1
      random :: lotto(n-1, maxRange)
    }
  }

  def lottoTailRec(n: Int, maxRange: Int): List[Int] = {
    @tailrec
    def lotto(a: Int, random: Random, acc: List[Int]): List[Int] = {
      if (a <= 0) acc
      else lotto(a-1, random, (random.nextInt(maxRange) + 1) :: acc)
    }
    lotto(n, new Random(), Nil)
  }

}
