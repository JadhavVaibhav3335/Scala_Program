object StudentInformation {
  def main(args: Array[String]): Unit = {
    var studentMap = Map[Int, String]()

    println("Enter student information (RollNo FirstName):")
    while (true) {
      val input = scala.io.StdIn.readLine()
      if (input.isEmpty) {
        // Stop accepting input when the user presses Enter with an empty input
        break
      }
      val Array(rollNo, firstName) = input.split(" ")
      studentMap += (rollNo.toInt -> firstName)
    }

    println("Enter a first name to search for students: ")
    val searchName = scala.io.StdIn.readLine()

    val matchingStudents = studentMap.collect {
      case (rollNo, name) if name == searchName => s"RollNo: $rollNo, FirstName: $name"
    }

    if (matchingStudents.nonEmpty) {
      println(s"Students with FirstName '$searchName':")
      matchingStudents.foreach(println)
    } else {
      println(s"No students found with FirstName '$searchName'.")
    }
  }
}
