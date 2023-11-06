object merge
{
	def main(args: Array[String])
	{
		val n1 = Set(10, 20 ,45)
		val n2 = Set(45, 30, 90)
		
		println("Set 1: " + n1)
		println("Set 2: " + n2)
		
		val n = n1 ++ n2
		println("Merged sets: " +n)
		
		val pr = n.product
		println("Product is: " + pr)
		
		var len = n.size
		val s = n.sum
		val avg = s/len
		println("Average is: " + avg)
	}
}
