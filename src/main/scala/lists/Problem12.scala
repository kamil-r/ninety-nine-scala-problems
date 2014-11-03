package lists

/**
 * Created by kamil on 19.10.14.
 */
object Problem12 {
  def decode[T](list: List[(Int, T)]): List[T] = {
    list flatMap {
      each => List.fill(each._1)(each._2)
    }
  }

  def main(args: Array[String]): Unit = {
    println(
      decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  }
}
