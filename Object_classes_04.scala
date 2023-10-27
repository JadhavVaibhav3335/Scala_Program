import scala.math.Pi

abstract class Shape {
  def volume(): Double
  def display(): Unit
}

class Cube(val sideLength: Double) extends Shape {
  def volume(): Double = sideLength * sideLength * sideLength

  def display(): Unit = {
    println("Cube Details:")
    println(s"Side Length: $sideLength")
    println(s"Volume: ${volume()}")
  }
}

class Cylinder(val radius: Double, val height: Double) extends Shape {
  def volume(): Double = Pi * radius * radius * height

  def display(): Unit = {
    println("Cylinder Details:")
    println(s"Radius: $radius")
    println(s"Height: $height")
    println(s"Volume: ${volume()}")
  }
}

object ShapeApp {
  def main(args: Array[String]): Unit = {
    println("Choose a shape to calculate volume:")
    println("1. Cube")
    println("2. Cylinder")
    print("Enter your choice (1 or 2): ")
    val choice = scala.io.StdIn.readInt()

    choice match {
      case 1 =>
        println("Enter the side length of the cube: ")
        val sideLength = scala.io.StdIn.readDouble()
        val cube = new Cube(sideLength)
        cube.display()
      case 2 =>
        println("Enter the radius of the cylinder: ")
        val radius = scala.io.StdIn.readDouble()
        println("Enter the height of the cylinder: ")
        val height = scala.io.StdIn.readDouble()
        val cylinder = new Cylinder(radius, height)
        cylinder.display()
      case _ =>
        println("Invalid choice. Please enter 1 for Cube or 2 for Cylinder.")
    }
  }
}
