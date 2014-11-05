package arithmetic

/**
 * Created by kamil on 04.11.14.
 */
object Problem41 {
  import Problem40._

  def getGoldbachList(range: Range): List[(Int, (Int, Int))] = {
    range filter { _ % 2 == 0 } map { n => (n, n.goldbach) } toList
  }

  def getGoldbachListLimited(range: Range, threshold: Int): List[(Int, (Int, Int))] = {
    getGoldbachList(range) filter { each => each._2._1 >= threshold && each._2._2 >= threshold }
  }
}
