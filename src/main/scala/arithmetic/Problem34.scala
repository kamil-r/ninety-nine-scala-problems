package arithmetic

/**
 * Created by T530 on 2014-10-31.
 */
object Problem34 {
  import Problem33._

  // Euler's so-called totient function phi(m) is defined as the number of positive integers r (1 <= r <= m)
  // that are coprime to m.
  def phi(m: Int) =
    (1 to m) filter { areComprise(_, m) } length
}
