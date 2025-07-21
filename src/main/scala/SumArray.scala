import scala.collection.mutable.ListBuffer

class SumArray {
  def sumArray(arr: Array[Int]): Int = {
    var sumTotal = 0
    arr.foreach(num =>
    sumTotal += num)
    sumTotal
  }
}
