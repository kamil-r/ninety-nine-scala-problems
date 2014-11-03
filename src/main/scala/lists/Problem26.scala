package lists

/**
 * Created by kamil on 25.10.14.
 */
object Problem26 {
  def combinations[A](n: Int, list: List[A]): List[List[A]] = {
    if(n <= 0) List(Nil)
    else flatMapSubLists(list) { xs =>
      combinations(n-1, xs.tail) map { xs.head :: _ }
    }
  }

  // flatMapSubLists is like list.flatMap, but instead of passing each element
  // to the function, it passes successive subLists of L.
  private def flatMapSubLists[A, B](ls: List[A])(f: (List[A]) => List[B]): List[B] = ls match {
    case Nil => Nil
    case subList@(_ :: xs) => f(subList) ::: flatMapSubLists(xs)(f)
  }
}
