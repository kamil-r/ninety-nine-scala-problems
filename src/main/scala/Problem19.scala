/**
 * Created by kamil on 22.10.14.
 */
object Problem19 {

  def rotate[A](n: Int, list: List[A]): List[A] = (n, list) match {
    case (_, Nil) => Nil
    case (0, curList) => curList
    case (c, x :: xs) if c > 0 => rotate(c-1, xs ++ List(x))
    case (c, curList) if c < 0 => rotate(c+1, curList.last :: curList.init)
  }

  def rotate2[A](n: Int, list: List[A]): List[A] = {
    val boundedN =
      if (list.isEmpty) 0
      else (if(n < 0) n + list.size else n) % list.size
    (list drop boundedN) ++ (list take boundedN) // instead of ++ one case use :::
  }

}
