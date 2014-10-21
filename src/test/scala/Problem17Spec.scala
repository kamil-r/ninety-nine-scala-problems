import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kamil on 21.10.14.
 */
class Problem17Spec extends FlatSpec with Matchers {
  import Problem17._

  "split" should "split list into two at given index" in {
    split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be ((List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    split(3, List(1, 2)) should be ((List(1, 2), List()))
  }

  "split2" should "split list into two at given index" in {
    split2(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be ((List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    split2(3, List(1, 2)) should be ((List(1, 2), List()))
  }

  "splitTailRec" should "split list into two at given index" in {
    splitTailRec(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be ((List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
    splitTailRec(3, List(1, 2)) should be ((List(1, 2), List()))
  }
}
