object CommonElementsBetweenSets {
  def main(args: Array[String]): Unit = {
    println("Enter elements for the first set (comma-separated):")
    val inputSet1 = scala.io.StdIn.readLine().split(",").map(_.trim).toSet

    println("Enter elements for the second set (comma-separated):")
    val inputSet2 = scala.io.StdIn.readLine().split(",").map(_.trim).toSet

    val commonElements = inputSet1.intersect(inputSet2)

    if (commonElements.nonEmpty) {
      println("Common elements between the two sets:")
      commonElements.foreach(println)
    } else {
      println("No common elements found between the two sets.")
    }
  }
}
