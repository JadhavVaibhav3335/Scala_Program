object DivisibleByThreeList {
  def main(args: Array[String]): Unit = {
    println("Generating a list of integers divisible by 3 from 1 to 50.")
    val numbers = 1 to 50
    val divisibleByThreeList = numbers.filter(num => num % 3 == 0).toList

    println("List of integers divisible by 3:")
    divisibleByThreeList.foreach(println)
  }
}
