package codes

import scala.collection.parallel.mutable

/**
 * Created by kamil on 09.11.14.
 */
object  Problem49 {

  def grayCode(n: Int): List[String] = n match {
    case 0 => List("")
    case 1 => List("0", "1")
    case i => {
      val prev = grayCode(i-1)
      prev.map("0" ++ _) ++ prev.reverse.map("1" ++ _)
    }
  }

  private val cache = collection.mutable.Map(0 -> List(""))
  def grayCodeCached(n: Int): List[String] = {
    if (!cache.contains(n)) {
      cache += n -> ((cache(n-1) map {"0" ++ _ }) ::: (cache(n-1).reverse map { "1" ++ _ }))
    }
    cache(n)
  }

}
