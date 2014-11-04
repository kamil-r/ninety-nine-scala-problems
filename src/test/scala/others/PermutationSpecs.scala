package others

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by kamil on 05.11.14.
 */
class PermutationSpecs extends FlatSpec with Matchers {
  import Permutation._

  "permutations" should "return a list of all permutations" in {
    permutations(Nil) should be (List(Nil))
    permutations(List(1)) should be (List(List(1)))
    permutations(List(1,2)).toSet should be (Set(List(1,2),List(2,1)))
    permutations(List(1,2,3)).toSet should be (Set(List(1,2,3),List(1,3,2),List(2,1,3),List(2,3,1),List(3,1,2),List(3,2,1)))

  }

}
