object StringRemove {
  def main(args: Array[String]): Unit = {
    println("Enter the first string: ")
    val firstString = scala.io.StdIn.readLine()

    println("Enter the second string to remove: ")
    val secondString = scala.io.StdIn.readLine()

    val resultString = removeOccurrences(firstString, secondString)
    println(s"Result after removing '$secondString' from '$firstString':")
    println(resultString)
  }

  def removeOccurrences(input: String, toRemove: String): String = {
    input.replace(toRemove, "")
  }
}
