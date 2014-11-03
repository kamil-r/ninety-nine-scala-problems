package lists

import scala.annotation.tailrec

/**
 * Created by kamil on 21.10.14.
 */
object Problem16 {
  def drop[A](n: Int, list: List[A]): List[A] = {
    if(n < 0) throw new IllegalArgumentException
    else list match {
      case x1 :: x2 :: _ :: xs => x1 :: x2 :: drop(n, xs)
      case _ => list
    }
  }

  def dropTailRecursive[A](n: Int, list: List[A]): List[A] = {
    @tailrec
    def dropN(c: Int, list: List[A], acc: List[A]): List[A] = (c, list) match {
      case(a, _) if a < 0 => throw new IllegalArgumentException
      case(_, Nil) => acc
      case(1, x :: xs) => dropN(n, xs, acc)
      case(_, x :: xs) => dropN(c-1, xs, acc ++ List(x))
    }
    dropN(n, list, Nil)
  }

  def dropFunctional[A](n: Int, list: List[A]): List[A] = {
    list.zipWithIndex filter {x => (x._2+1) % n != 0} map { _._1 }
  }
}
