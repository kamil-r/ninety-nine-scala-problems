package lists

/**
 * Created by kamil on 25.10.14.
 */
object Problem28 {

  //  We suppose that a list contains elements that are lists themselves.
  //  The objective is to sort the elements of the list according to their length.
  //  E.g. short lists first, longer lists later, or vice versa.

  def lsort[A](ls: List[List[A]]) =
    ls map { x => (x, x.length) } sortBy(_._2) map (_._1)

  def lsort2[A](ls: List[List[A]]) =
    ls sortWith({ (e1, e2) => e1.length < e2.length })


  //  Again, we suppose that a list contains elements that are lists themselves.
  //  But this time the objective is to sort the elements according to their length frequency;
  //  i.e. in the default, sorting is done ascendingly, lists with rare lengths are placed, others
  //  with a more frequent length come later.
  //
  //  scala> lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
  //  res1: List[List[Symbol]] = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
  //  Note that in the above example, the first two lists in the result have length 4 and 1 and both lengths appear just once.
  //  The third and fourth lists have length 3 and there are two list of this length. Finally, the last three lists have length 2.
  //  This is the most frequent length.

  def lsortFreq[A](ls: List[List[A]]) = {
    val withFreq = ((ls.groupBy({ el => el.length}).toList).flatMap({ x => x._2.map({ y => (y, x._2.length)})}))
    withFreq sortWith { _._2 < _._2 } map { _._1 }
  }
}
