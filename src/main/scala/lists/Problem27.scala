package lists

/**
 * Created by kamil on 25.10.14.
 */
object Problem27 {
  import lists.Problem26._

  def group3[A](list: List[A]) = {
    for {
      a2 <- combinations(2, list)
      noA2 = list.filter(!a2.contains(_))
      b3 <- combinations(3, noA2)
    } yield List(a2, b3, noA2.filter(!b3.contains(_)))
  }

  def group[A](sizes: List[Int], list: List[A]): List[List[List[A]]] = sizes match {
    case Nil => Nil
    case x :: xs => combinations(x, list) flatMap {
      c => group(xs, list.filter(!c.contains(_))) map { c :: _ }
    }
  }
}
