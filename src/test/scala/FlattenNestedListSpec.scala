import org.scalatest.flatspec.AnyFlatSpec

class FlattenNestedListSpec extends AnyFlatSpec {
  val flatNest =  new FlattenNestedList

  "flattenNestedList1" should "flatten" in {
    val input = flatNest.flattenNestedList(List(1,2,List(1,2)))
    val expectedResult = List(1,2,1,2)
    assert(input == expectedResult)
  }
  "flattenNestedList2" should "flatten" in {
    val input = flatNest.flattenNestedList(List(1,List(2,3,List(4,5))))
    val expectedResult = List(1,2,3,4,5)
    assert(input == expectedResult)
  }
  "flattenNestedList3" should "flatten" in {
    val input = flatNest.flattenNestedList(List(1,2,List(3,List(4,5,6),List(7)),8))
    val expectedResult = List(1,2,3,4,5,6,7,8)
    assert(input == expectedResult)
  }



}
