object MergeSetsProductAverage {
  def main(args: Array[String]): Unit = {
    println("Enter elements for the first set (comma-separated):")
    val inputSet1 = scala.io.StdIn.readLine().split(",").map(_.trim).map(_.toInt).toSet

    println("Enter elements for the second set (comma-separated):")
    val inputSet2 = scala.io.StdIn.readLine().split(",").map(_.trim).map(_.toInt).toSet

    val mergedSet = inputSet1.union(inputSet2)

    if (mergedSet.nonEmpty) {
      val product = mergedSet.product
      val average = mergedSet.sum.toDouble / mergedSet.size

      println("Merged Set:")
      mergedSet.foreach(println)
      println(s"Product of all elements: $product")
      println(s"Average of all elements: $average")
    } else {
      println("The merged set is empty. Please enter some elements.")
    }
  }
}
