package lists

/**
 * Created by kamil on 19.10.14.
 */
object Problem10 {
  def encode[T](list: List[T]): List[(Int, T)] = {
      Problem9.pack(list) map {
        listElement => (listElement.length, listElement.head)
      }
    }

  def main(args: Array[String]): Unit = {
    println(
      encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
