package logic

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by T530 on 2014-11-05.
 */
class Problem46Spec extends FlatSpec with Matchers {
  import Problem46._

  "table2" should "return truth table" in {
    table2((a, b) => and(a, or(a, b))) should be (List(
      ((true, true), true),
      ((true, false), true),
      ((false, true), false),
      ((false, false), false)))
  }

  "printTable2" should "print truth table" in {
    printTable2((a, b) => and(a, or(a, b)))
  }
}
