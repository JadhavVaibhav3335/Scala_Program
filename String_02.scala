object CharacterCount {
  def main(args: Array[String]): Unit = {
    println("Enter a string: ")
    val inputString = scala.io.StdIn.readLine()

    println("Enter the character to count: ")
    val characterToCount = scala.io.StdIn.readChar()

    val count = countOccurrences(inputString, characterToCount)
    println(s"The character '$characterToCount' appears $count times in the input string.")
  }

  def countOccurrences(input: String, charToCount: Char): Int = {
    input.count(_ == charToCount)
  }
}
