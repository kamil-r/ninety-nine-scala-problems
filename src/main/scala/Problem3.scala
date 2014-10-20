/**
 * Created by kamil on 18.10.14.
 */
object Problem3 {
  def nth[T](n: Int, list: List[T]): T = (n, list) match {
    case (num, list) if num < 0 || list.isEmpty =>
      throw new IllegalArgumentException()
    case (0, x :: xs) => x
    case (num, x :: xs) => nth(num - 1, xs)
  }

  def main(args: Array[String]): Unit = {
    print(nth(1, List(1,2,5)))
//    print(nth(1, List()))
  }
}
