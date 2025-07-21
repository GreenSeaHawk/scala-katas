import org.scalatest.flatspec.AnyFlatSpec

class ReverseStringSpec extends AnyFlatSpec {
  val revStr =  new ReverseString

  "reverseString" should "reverse order of single word strings" in {
    val input = revStr.reverseString("singleword")
    val expectedResult = "drowelgnis"
    assert(input == expectedResult)
  }

  "reverseString" should "reverse order of multi-word strings" in {
    val input = revStr.reverseString("multiple word string")
    val expectedResult = "gnirts drow elpitlum"
    assert(input == expectedResult)
  }


}
