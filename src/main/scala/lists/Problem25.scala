package lists

/**
 * Created by kamil on 25.10.14.
 */
object Problem25 {
  import lists.Problem23.randomSelect

  def randomPermute[A](list: List[A]) =
    randomSelect(list.length, list)
}
