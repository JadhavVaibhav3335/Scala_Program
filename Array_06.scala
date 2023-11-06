object Array_06{
  def main(args: Array[String]):Unit={
    val matrix1=Array(
    Array(1,2,3),
    Array(4,5,6))
    val matrix2=Array(
    Array(7,8),
    Array(9,10),
    Array(11,12))
    
    if (matrix1(0).length!=matrix2.length){
       println("Matrix Multiplication is not possible")
       }
       else
       {
          val result=multiplyMatrices(matrix1,matrix2)
          println("Matrix1:")
          printMatrix(matrix1)
          println("Matrix2:")
          printMatrix(matrix2)
          println("Result:")
          printMatrix(result)
       }
    } 
    def multiplyMatrices(matrix1:Array[Array[Int]],matrix2:Array[Array[Int]]):Array[Array[Int]]={
      val rows1=matrix1.length
      val cols1= matrix1(0).length
      val cols2= matrix2(0).length
       
       val result=Array.ofDim[Int](rows1,cols2)
       for(i<-0 until rows1){
         for(j <-0 until cols2){
            for(k<-0 until cols1){
              result(i)(j)+=matrix1(i)(k)*matrix2(k)(j)
            }
         }
       }
       result
    }
    def printMatrix(matrix:Array[Array[Int]]):Unit={
       for(i<- matrix.indices){
         for(j<-matrix(i).indices){
           print(matrix(i)(j)+" ")
         }
         println()
       }
    }
  }
