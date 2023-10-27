object StringSearch {
  def main(args: Array[String]): Unit = {
    val array = Array("apple", "banana", "cherry", "date", "elderberry")

    println("Enter a string to search for: ")
    val searchString = scala.io.StdIn.readLine()

    val matchingStrings = findMatchingStrings(array, searchString)

    if (matchingStrings.nonEmpty) {
      println(s"Elements containing '$searchString' in the array:")
      matchingStrings.foreach(println)
    } else {
      println(s"No elements in the array contain '$searchString'.")
    }
  }

  def findMatchingStrings(array: Array[String], searchString: String): Array[String] = {
    array.filter(_.contains(searchString))
  }
}
