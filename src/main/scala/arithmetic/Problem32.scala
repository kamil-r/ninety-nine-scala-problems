package arithmetic

/**
 * Created by T530 on 2014-10-31.
 */
object Problem32 {
  def gcdDivide(x: Int, y: Int): Int = {
    val (greater, lower) = if (x >= y) (x, y) else (y, x)
    val rest = greater % lower
    if (rest == 0) lower else gcdDivide(lower, rest)
  }
  
  def gcdDivide2(x: Int, y: Int): Int = {
    if (y == 0) x else gcdDivide2(y, x % y)
  }

  def gcdSubtract(x: Int, y: Int): Int = {
    val (greater, lower) = if (x >= y) (x, y) else (y, x)
    if (lower == 0) lower else gcdDivide(lower, greater - lower)
  }

}
