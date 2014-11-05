package logic

/**
 * Created by T530 on 2014-11-05.
 */
object Problem46 {
  def not(a: Boolean) = a match {
    case true => false
    case false => true
  }
  def and(a: Boolean, b: Boolean): Boolean = (a, b) match {
    case (true, true) => true
    case _ => false
  }
  def or(a: Boolean, b: Boolean): Boolean = (a, b) match {
    case(true, _) => true
    case(_, true) => true
    case _ => false
  }
  def nand(a: Boolean, b: Boolean): Boolean = not(and(a, b))
  def nor(a: Boolean, b: Boolean): Boolean = not(or(a, b))
  def xor(a: Boolean, b: Boolean): Boolean = not(equ(a, b))
  def impl(a: Boolean, b: Boolean): Boolean = or(not(a), b)
  def equ(a: Boolean, b: Boolean): Boolean = or(and(a, b), and(not(a), not(b)))

  def table2(f: (Boolean, Boolean) => Boolean): List[((Boolean, Boolean), Boolean)] = {
    val trueFalse = List(true, false)
    for {
      a <- trueFalse
      b <- trueFalse
    } yield ((a, b), f(a,b))
  }

  def printTable2(f: (Boolean, Boolean) => Boolean): Unit = {
    println("A     B     result")
    table2(f).foreach(row => printf("%-5s %-5s %-5s\n", row._1._1, row._1._2, row._2))
  }
}
