import org.scalatest.flatspec.AnyFlatSpec

class SumArraySpec extends AnyFlatSpec {
  val sumArr=  new SumArray

  "sumArray" should "return 5 when given an array of 2,3" in {
    val input = sumArr.sumArray(Array(2,3))
    val expectedResult = 5
    assert(input == expectedResult)
  }

  "sumArray" should "return 12 when given an array of 2,3,4,1,2" in {
    val input = sumArr.sumArray(Array(2,3,4,1,2))
    val expectedResult = 12
    assert(input == expectedResult)
  }


}
