object ListCreation {
  def main(args: Array[String]): Unit = {
    // List created using Lisp style (cons method)
    println("Enter elements for the Lisp-style list (end with 'q'): ")
    val lispList = createLispStyleList(Nil)
    println(s"Lisp-style List: $lispList")

    // List created using Java style
    println("Enter elements for the Java-style list (comma-separated): ")
    val javaStyleList = createJavaStyleList()
    println(s"Java-style List: $javaStyleList")

    // List created using 'fill' method
    println("Enter the size of the 'fill' list: ")
    val fillListSize = scala.io.StdIn.readInt()
    val fillListValue = "FillValue" // You can change this value
    val fillList = List.fill(fillListSize)(fillListValue)
    println(s"'fill' List: $fillList")

    // List created using 'range' method
    println("Enter the start value for the 'range' list: ")
    val rangeStart = scala.io.StdIn.readInt()
    println("Enter the end value for the 'range' list: ")
    val rangeEnd = scala.io.StdIn.readInt()
    val rangeList = (rangeStart until rangeEnd).toList
    println(s"'range' List: $rangeList")

    // List created using 'tabulate' method
    println("Enter the size of the 'tabulate' list: ")
    val tabulateListSize = scala.io.StdIn.readInt()
    val tabulateList = List.tabulate(tabulateListSize)(n => n * n)
    println(s"'tabulate' List: $tabulateList")
  }

  // Create Lisp-style list recursively
  def createLispStyleList(acc: List[String]): List[String] = {
    val input = scala.io.StdIn.readLine()
    if (input == "q") {
      acc.reverse
    } else {
      createLispStyleList(input :: acc)
    }
  }

  // Create Java-style list using split and map
  def createJavaStyleList(): List[String] = {
    val input = scala.io.StdIn.readLine()
    input.split(",").map(_.trim).toList
  }
}
