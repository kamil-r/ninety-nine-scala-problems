/**
 * Created by kamil on 21.10.14.
 */
object Problem18 {
  def slice[A](x: Int, y: Int, list: List[A]): List[A] = {
    list drop x take y - (x max 0)
  }
}
