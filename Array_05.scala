object Array_05{
  def main(args:Array[String]):Unit={
  val matrix = Array(
    Array(5,2,9),
    Array(3,7,1),
    Array(8,4,6))
  
  val sortedMatrix= matrix.map(row => insertionSort(row))
  for(row <- sortedMatrix)
  {
     println(row.mkString(""))
  }
  }
  def insertionSort(arr:Array[Int]):Array[Int]={
    for(i<-1 until arr.length){
      val key=arr(i)
      var j=i-1
      while(j>=0 && arr(j)>key){
       arr(j+1)=arr(j)
       j=j-1
      }
      arr(j+1)=key
    }
    arr
  }
}

