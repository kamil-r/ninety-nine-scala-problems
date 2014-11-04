package others

/**
 * Created by kamil on 04.11.14.
 */
object Permutation {

//  def permutations[A](list: List[A]): List[List[Any]] = {
//    for {
//      x <- list
//      xs = gen((list diff List(x)).toList)
//    } yield xs match {
//      case Nil => List(x)
//      case ls => ls map (x :: _)
//    }
//  }

  def permutations[A](list: List[A]): List[List[A]] = list match {
    case Nil => List(Nil)
    case List(_) => List(list)
    case _ => for {
        x <- list
        xs <- permutations((list diff List(x)).toList)
      } yield x :: xs
  }
}
