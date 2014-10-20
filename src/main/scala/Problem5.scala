/**
 * Created by kamil on 18.10.14.
 */
object Problem5 {
  def reverse[T](list: List[T]): List[T] = list match {
    case List() => List()
    case List(x) => List(x)
    case x :: xs => reverse(xs) ++ List(x)
  }

  def reverse2[T](list: List[T]): List[T] = {
    list.foldLeft(List[T]()) { (ls, el) => el :: ls }
  }

  def main(args: Array[String]): Unit = {
    println(reverse(List(1, 2, 3, 5, 8)))
    println(reverse2(List(1, 2, 3, 5, 8)))
  }
}
