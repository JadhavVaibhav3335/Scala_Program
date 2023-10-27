object LowercaseToUppercase {
  def main(args: Array[String]): Unit = {
    println("Enter a string of lowercase letters (no spaces): ")
    val inputString = scala.io.StdIn.readLine()

    val convertedString = convertToLowercaseToUppercase(inputString)

    println(s"Uppercase conversion result: $convertedString")
  }

  def convertToLowercaseToUppercase(inputString: String): String = {
    inputString.map { char =>
      if (char.isLower) char.toUpper else char
    }
  }
}
