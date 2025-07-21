import scala.collection.mutable.ListBuffer

class ReverseString {
  def reverseString(str: String): String = {
    val revList = new ListBuffer[String]
    for(i <- (str.length - 1) to 0 by -1){
      revList += str(i).toString
    }
    revList.mkString("")
  }
}
