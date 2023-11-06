object comm
{
	def main(args: Array[String])
	{
		val s1 = Set(10, 20, 40, 50, 30)
		val s2 = Set(20, 30, 70, 80, 90)
	
		print("Set 1: " + s1)
		print("\nSet 2: " + s2)
	
		val comm = s1.intersect(s2)
		
		println("\nCommon elements: " + comm)
	}-
