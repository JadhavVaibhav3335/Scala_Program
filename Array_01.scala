object Array_01{
   def main(args:Array[String])
   {
     println("Enter num of  Array Element:")
     val n=readInt()
     val arr=new Array[Int](n)
     
     println("Enter"+n+"Element, one at a time")
     for(i<-0 until n)
     {
     arr(i)=readInt()
     }
     val max=arr.max
     val min=arr.min
  
      println("Max value in Array="+max)
      println("Min value in Array="+min)
   }
}
