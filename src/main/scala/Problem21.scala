/**
 * Created by kamil on 25.10.14.
 */
object Problem21 {
  def insertAt[A](el: A, n: Int, list: List[A]): Option[List[A]] = (n, list) match {
    case (a, _) if a < 0 => None
    case (a, xs) if a > xs.length => None
    case (0, xs) => Some(el :: xs)
    case (a, x :: xs) => insertAt(el, a-1, xs) match {
      case None => None
      case Some(ls) => Some(x :: ls)
    }
  }

  def insertAt2[A](el: A, n: Int, list: List[A]): List[A] = {
    val (pre, post) = list splitAt n
    pre ::: el :: post
  }
}
