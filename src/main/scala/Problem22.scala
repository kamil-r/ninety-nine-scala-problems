/**
 * Created by kamil on 25.10.14.
 */
object Problem22 {
  def range(x: Int, y: Int): List[Int] = {
    if(x > y) Nil
    else if(x == y) List(x)
    else x :: range(x+1, y)
  }

  def rangeBuildIn(x: Int, y: Int): List[Int] = (x to y).toList

  def rangeFunctional(x: Int, y: Int): List[Int] = unfoldRight(x) {
    n => if(n > y) None else Some(n, n + 1)
  }

  // The classic functional approach would be to use `unfoldr`, which Scala
  // doesn't have.  So we'll write one and then use it.
  //  def unfoldRight[A, B](seed: B)(f: B => Option[(A, B)]): List[A] = f(seed) match {
  //         |   case Some((a, b)) => a :: unfoldRight(b)(f)
  //         |   case None => Nil
  //         | }
  //  unfoldRight: [A,B](B)((B) => Option[(A, B)])List[A]
  //  scala> unfoldRight(10) { x => if (x == 0) None else Some((x, x - 1)) }
  //  res0: List[Int] = List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
  private def unfoldRight[A, B](s: B)(f: B => Option[(A, B)]): List[A] = f(s) match {
    case None => Nil
    case Some((r,n)) => r :: unfoldRight(n)(f)
  }

  //  scala> def unfoldLeft[A, B](seed: B)(f: B => Option[(B, A)]) = {
  //         |   def loop(seed: B)(ls: List[A]): List[A] = f(seed) match {
  //           |     case Some((b, a)) => loop(b)(a :: ls)
  //           |     case None => ls
  //           |   }
  //         |
  //         |   loop(seed)(Nil)
  //         | }
  //  unfoldLeft: [A,B](B)((B) => Option[(B, A)])List[A]
  //  scala> unfoldLeft(1) { x => if (x == 11) None else Some((x + 1, x)) }
  //  res0: List[Int] = List(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
}
