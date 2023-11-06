import scala.io.StdIn.readInt
object Array_02 {
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
   def transpose(matrix:Array[Array[Int]]):Array[Array[Int]]={
   
      val numRows=matrix.length
       val numColms=matrix(0).length
       
       val result=Array.ofDim[Int](numColms,numRows)
        for(i<-0 until numRows)
        {
          for(j<-0 until numColms)
          {
             result(j)(i)=matrix(i)(j)
          }
        }
       result
   }
   
   def printMatrix(matrix:Array[Array[Int]]):Unit={
     for (row <- matrix){
     for(element<-row){
       print(s"$element\t")
     }
     println()
     }
   }
}
