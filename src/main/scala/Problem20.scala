/**
 * Created by kamil on 25.10.14.
 */
object Problem20 {
  def removeAt[A](n: Int, list: List[A]): Option[(List[A], A)] = (n, list) match {
    case(_, Nil) => None
    case(a, _) if a < 0 => None
    case(0, x :: xs) => Some((xs, x))
    case(a, x :: xs) =>
      removeAt(a-1, xs) match {
        case Some((ls, el)) => Some((x :: ls, el))
        case None => None
      }
  }

  def removeAt2[A](n: Int, list: List[A]): Option[(List[A], A)] = list splitAt n match {
    case (Nil, _) => None
    case (_, Nil) => None
    case (xs, y :: ys) => Some((xs ++ ys, y))
  }
}
