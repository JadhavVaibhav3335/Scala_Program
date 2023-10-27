object EvenNumbersProduct {
  def main(args: Array[String]): Unit = {
    println("Generating a list of even numbers up to 10 and calculating their product.")
    val evenNumbersList = (2 to 10 by 2).toList

    println("List of even numbers:")
    evenNumbersList.foreach(println)

    val product = evenNumbersList.product
    println(s"Product of even numbers in the list: $product")
  }
}
