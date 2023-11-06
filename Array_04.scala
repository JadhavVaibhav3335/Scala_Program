import scala.io.StdIn.readInt
object Array_04{
  def main(args:Array[String]):Unit=
  {
       print("Enter the number of rows:\n")
      val numRows=readInt()
      print("Enter the Number of Columns:")
      val numColms=readInt()
      val matrix=Array.ofDim[Double](numRows,numColms)
      
      println("Enter the Matrix Element Row By Row:")
      for(i<-0 until numRows)
      {
         for(j<-0 until numColms)
          {
          matrix(i)(j)=readInt() 
      }
    }
    val isUppertringle=checkUppertringle(matrix)
    if(isUppertringle)
    {
      println("Matrix is Upper Tringular")
    }
    else
    {
      println("Matrix is not Upper Tringular")
    }
  }
   def checkUppertringle(matrix:Array[Array[Double]]):Boolean=
   {
    val numRows=matrix.length
       val numColms=matrix(0).length
        for(i<-0 until numRows)
        {
          for(j<-0 until numColms)
          {
             if(i>j &&matrix(i)(j)!=0)
             {
              return false
             }
          }
        }
        true
   }
}
