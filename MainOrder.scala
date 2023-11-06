abstract class Order(id:Int,description:String)
class PurchaseOrder(id:Int,description:String,vendor:String) extends Order(id,description)
{
def displayDetails():Unit=
{
 println("Id: "+id)
  println("Description: "+description)
   println("Vendor: "+vendor)
}
}

class SalesOrder(id:Int,description:String,customer:String)extends Order(id,description)
{
def displayDetails():Unit=
{
 println("Id: "+id)
  println("Description: "+description)
   println("Customer: "+customer)
}

}

object MainOrder{
def main(args:Array[String]):Unit=
{
val PurchaseOrder=new PurchaseOrder(1,"Computer","Dell")
val SalesOrder=new SalesOrder(1,"Ip","Rj")

println("Purchase Order Details: ")
PurchaseOrder.displayDetails()

 println("Sales Order details:")
 SalesOrder.displayDetails

}
}
