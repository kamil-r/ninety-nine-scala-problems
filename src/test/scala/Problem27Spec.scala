import org.scalatest._

/**
 * Created by kamil on 25.10.14.
 */
class Problem27Spec extends FunSuite with GivenWhenThen {
  import Problem27._

  test("group3") {
    Given("input list")
    val inputList = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    val inputElements = inputList.toSet
    When("group run")
    val grouped = group3(inputList)
    Then("constraints should match")
    val incorrect = for{
      group <- grouped
      if group.length != 3
      if group(0).length != 2
      if group(1).length != 3
      if group(2).length != 4
      if group.flatten.toSet != inputElements
    } yield group
    assert(incorrect.length == 0)
  }

  test("group n") {
    Given("input list")
    val inputList = List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")
    val inputElements = inputList.toSet
    val sizes = List(2, 2, 5)
    When("group run")
    val grouped = group3(inputList)
    Then("constraints should match")
    val incorrect = for{
      group <- grouped
      if group.length != sizes.length
      if group.map(_.length) != sizes
      if group.flatten.toSet != inputElements
    } yield group
    assert(incorrect.length == 0)
  }
}
