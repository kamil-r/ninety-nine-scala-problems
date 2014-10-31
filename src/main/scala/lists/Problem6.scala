package lists

/**
 * Created by kamil on 18.10.14.
 */
object Problem6 {
  def palindrome[T](list: List[T]) = {
    list == list.reverse
  }
}
