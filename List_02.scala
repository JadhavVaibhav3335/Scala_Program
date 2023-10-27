object MergeAndSortLists {
  def main(args: Array[String]): Unit = {
    // Accept values for the first list
    println("Enter elements for the first list (comma-separated): ")
    val inputList1 = scala.io.StdIn.readLine()
    val list1 = inputList1.split(",").map(_.trim).toList

    // Accept values for the second list
    println("Enter elements for the second list (comma-separated): ")
    val inputList2 = scala.io.StdIn.readLine()
    val list2 = inputList2.split(",").map(_.trim).toList

    // Merge the two lists
    val mergedList = list1 ++ list2

    // Sort the merged list in ascending order
    val sortedList = mergedList.sorted

    // Display the merged and sorted list
    println("Merged and Sorted List (in ascending order):")
    sortedList.foreach(println)
  }
}
