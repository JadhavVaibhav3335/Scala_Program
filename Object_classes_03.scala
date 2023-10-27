abstract class Order(val id: Int, val description: String)

class PurchaseOrder(id: Int, description: String, val vendor: String) extends Order(id, description)

class SalesOrder(id: Int, description: String, val customer: String) extends Order(id, description)

object OrderApp {
  def main(args: Array[String]): Unit = {
    println("Enter Purchase Order details:")
    println("Enter Order ID: ")
    val purchaseOrderId = scala.io.StdIn.readInt()
    println("Enter Order Description: ")
    val purchaseOrderDesc = scala.io.StdIn.readLine()
    println("Enter Vendor Name: ")
    val purchaseOrderVendor = scala.io.StdIn.readLine()

    val purchaseOrder = new PurchaseOrder(purchaseOrderId, purchaseOrderDesc, purchaseOrderVendor)

    println("\nEnter Sales Order details:")
    println("Enter Order ID: ")
    val salesOrderId = scala.io.StdIn.readInt()
    println("Enter Order Description: ")
    val salesOrderDesc = scala.io.StdIn.readLine()
    println("Enter Customer Name: ")
    val salesOrderCustomer = scala.io.StdIn.readLine()

    val salesOrder = new SalesOrder(salesOrderId, salesOrderDesc, salesOrderCustomer)

    // Display Purchase Order details
    println("\nPurchase Order Details:")
    println(s"Order ID: ${purchaseOrder.id}")
    println(s"Order Description: ${purchaseOrder.description}")
    println(s"Vendor: ${purchaseOrder.vendor}")

    // Display Sales Order details
    println("\nSales Order Details:")
    println(s"Order ID: ${salesOrder.id}")
    println(s"Order Description: ${salesOrder.description}")
    println(s"Customer: ${salesOrder.customer}")
  }
}
