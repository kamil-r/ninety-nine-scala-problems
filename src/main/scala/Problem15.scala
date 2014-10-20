/**
 * Created by kamil on 20.10.14.
 */
object Problem15 {
  def duplicateN[T](n: Int, list: List[T]): List[T] =
    list flatMap { e => List.fill(n)(e) }
}
