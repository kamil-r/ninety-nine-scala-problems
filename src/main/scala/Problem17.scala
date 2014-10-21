import scala.annotation.tailrec

/**
 * Created by kamil on 21.10.14.
 */
object Problem17 {
  def split[A](n: Int, list: List[A]): (List[A], List[A]) = {
    if(n < 0) throw new IllegalArgumentException
    else list.splitAt(n)
  }

  def split2[A](n: Int, list: List[A]): (List[A], List[A]) = {
    (list take n, list drop n)
  }

  def splitTailRec[A](n: Int, list: List[A]): (List[A], List[A]) = {
    @tailrec
    def splitN(curN: Int, curList: List[A], acc: List[A]): (List[A], List[A]) = (curN, curList) match {
      case(_, Nil) => (acc, Nil)
      case(0, xs) => (acc, xs)
      case(a, x :: xs) => splitN(a-1, xs, acc ++ List(x))
    }
    splitN(n, list, Nil)
  }
}
