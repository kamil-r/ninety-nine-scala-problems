package arithmetic

/**
 * Created by T530 on 2014-11-04.
 */
object Problem37 {
  import Problem36._

  def phi(x: Int): Int = {
    x.primeFactorMultiplicity.foldLeft(1)( (acc, prime) =>
      acc * (prime._1-1)*math.pow(prime._1, prime._2-1).toInt )
  }

}
