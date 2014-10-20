/**
 * Created by kamil on 19.10.14.
 */
object Problem11 {
  def encodeModified[T](list: List[T]): List[Either[T, (Int, T)]] = {
    Problem9.pack(list) map {
      element =>
        if(element.length == 1) Left(element.head)
        else Right(element.length, element.head)
    }
  }

  def main(args: Array[String]): Unit = {
    println(
      encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
