package lists

/**
 * Created by kamil on 20.10.14.
 */
object Problem14 {
  def duplicate[T](list: List[T]): List[T] =
    list flatMap { e => List(e, e) }
}
