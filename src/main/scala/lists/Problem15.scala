package lists

/**
 * Created by kamil on 20.10.14.
 */
object Problem15 {
  def duplicateN[T](n: Int, list: List[T]): List[T] =
    if(n < 0) throw new IllegalArgumentException
    else list flatMap { e => List.fill(n)(e) }
}
