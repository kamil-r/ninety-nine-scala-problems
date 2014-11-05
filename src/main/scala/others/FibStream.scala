package others

/**
 * Created by T530 on 2014-10-28.
 */
object FibStream {

  def fibStream(): Stream[Int] = {
    0 #:: 1 #:: (fibStream zip fibStream.tail map { case (x, y) => x + y })
  }

  def fibStream2(): Stream[Int] = {
    def fib(x: Int, y: Int): Stream[Int] = x #:: fib(y, x + y)
    fib(0, 1)
  }
}
