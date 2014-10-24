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
  private def unfoldRight[A, B](s: B)(f: B => Option[(A, B)]): List[A] = f(s) match {
    case None => Nil
    case Some((r,n)) => r :: unfoldRight(n)(f)
  }
}
