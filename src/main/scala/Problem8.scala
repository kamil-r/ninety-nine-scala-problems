/**
 * Created by kamil on 18.10.14.
 */
object Problem8 {
  def compress[T](list: List[T] ): List[T] = {
    list.foldRight(List[T]())({
      (el, acc) =>
        if(acc.isEmpty || el != acc.head)
          el :: acc
        else
          acc
    })
  }

  def compress2[T](list: List[T]): List[T] = {
    def compressWithAcc(list: List[T], acc: List[T]): List[T] = list match {
      case List() => acc
      case x :: xn => if (acc.isEmpty || x != acc.head) compressWithAcc(xn, x :: acc) else compressWithAcc(xn, acc)
    }
    compressWithAcc(list, List()).reverse
  }

  def compress3[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case x :: xs => x :: compress3(xs.dropWhile(_ == x))
  }

  def main(args: Array[String]): Unit = {
    println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    println(compress2(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
    println(compress3(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
