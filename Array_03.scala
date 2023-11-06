import scala.io.StdIn.readInt
object Array_03 {
  def main (args:Array[String]):Unit={
      print("Enter the number of rows:\n")
      val numRows=readInt()
      print("Enter the Number of Columns:")
      val numColms=readInt()
      
      val matrix=Array.ofDim[Int](numRows,numColms)
      println("Enter the Matrix Element Row By Row:")
      for(i<-0 until numRows)
      {
      for(j<-0 until numColms)
      {
      
          matrix(i)(j)=readInt()
          
      }
    }
  println("\n Orignal Matrix:")
  println("\n Tranpose Matrix:")  
  printMatrix(matrix)
  
  val transposeMatrix=transpose(matrix)
  println("\n Transpose Matrix")
  printMatrix(transposeMatrix)
   }
