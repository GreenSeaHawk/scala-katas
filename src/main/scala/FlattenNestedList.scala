import scala.collection.mutable.ListBuffer

class FlattenNestedList {
  def flattenNestedList(li : List[Any]): List[Any] = {
    val flattenedList = new ListBuffer[Int]

    def helperFunc(reLi: List[Any]): Unit = {
      for (ele <- reLi) {
        ele match {
          case a: Int =>
            flattenedList += a
//            println("found int")
          case b: List[Any] =>
//            println("found list")
            helperFunc(b)
        }
      }
    }
    helperFunc(li)
    flattenedList.toList
  }

}
