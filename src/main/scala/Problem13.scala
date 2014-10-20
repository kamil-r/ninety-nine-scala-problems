/**
 * Created by kamil on 19.10.14.
 */
object Problem13 {

  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    def encode[T](list: List[T], acc: List[(Int, T)]): List[(Int, T)] = (list, acc) match {
      case (Nil, acc) => acc
      case (x :: xs, Nil) => encode(xs, List((1, x)))
      case (x :: xs, acc @ (n: Int, a) :: as) =>
        if(x == a) encode(xs, (n+1, a) :: as)
        else encode(xs, (1, x) :: acc)
    }
    encode(list, Nil).reverse
  }

  def encodeDirect2[T](list: List[T]): List[(Int, T)] = list match {
    case Nil => Nil
    case x :: xs =>
      Problem9.pack(list) map (element => (element.length, element.head))
  }

  def encodeDirect3[T](list: List[T]): List[(Int, T)] = list match {
    case Nil => Nil
    case ls @ x :: xs =>
      val (packed, rest) = ls span (_ == ls.head)
      (packed.length, packed.head) :: encodeDirect3(rest)
  }

  def main(args: Array[String]): Unit = {
    println(
      encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    println(
      encodeDirect2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    println(
      encodeDirect3(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
