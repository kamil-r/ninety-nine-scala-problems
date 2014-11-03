package lists

/**
 * Created by kamil on 19.10.14.
 */
object Problem9 {
  def pack[T](list: List[T]): List[List[T]] = {
    list.foldRight(List[List[T]]())({
      (element, acc) => acc match {
        case Nil => List(element) :: acc
        case x :: xs =>
          if (x.head == element) (element :: x) :: xs
          else List(element) :: acc
      }
    })
  }

  def pack2[T](list: List[T]): List[List[T]] = list match {
    case Nil => List(Nil)
    case x :: xs =>
      val (packed, next) = list.span(_ == x)
      if(next == Nil) List(packed)
      else packed :: pack2(next)
  }

  def main(args: Array[String]): Unit = {
    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    println(pack2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
