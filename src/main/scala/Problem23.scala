/**
 * Created by kamil on 25.10.14.
 */
object Problem23 {
  import Problem20._

  def randomSelect[A](n : Int, list: List[A]): List[A] = n match {
    case a if a <= 0 => Nil
    case a if a > list.size => list
    case a => {
      // val idx = math.round(math.random * (list.length-1)).toInt
      val idx = (new util.Random).nextInt(list.length)
      removeAt(idx, list) match {
        case None => Nil
        case Some((curList, el)) => el :: randomSelect(a-1, curList)
      }
    }
}

}
