package arithmetic

/**
 * Created by T530 on 2014-10-31.
 */
object Problem33 {
  import Problem32._

  def areComprise(x: Int, y: Int) =
    gcdDivide(x, y) == 1

}
