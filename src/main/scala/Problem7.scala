/**
 * Created by kamil on 18.10.14.
 */
object Problem7 {
  def flatten(list: List[Any]): List[Any] = list flatMap {
    case ls: List[_] => flatten(ls)
    case el => List(el)
  }

  def main(args: Array[String]): Unit = {
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))
  }
}
