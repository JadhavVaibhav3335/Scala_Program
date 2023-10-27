object LargestAndSmallestElement {
  def main(args: Array[String]): Unit = {
    println("Enter elements for the set (comma-separated):")
    val inputSet = scala.io.StdIn.readLine().split(",").map(_.trim).toSet

    if (inputSet.nonEmpty) {
      val intSet = inputSet.map(_.toInt)

      val smallest = intSet.min
      val largest = intSet.max

      println(s"Smallest element in the set: $smallest")
      println(s"Largest element in the set: $largest")
    } else {
      println("The set is empty. Please enter some elements.")
    }
  }
}
