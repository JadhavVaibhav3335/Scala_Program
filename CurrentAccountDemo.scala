import scala.io.StdIn._
import scala.util._
class CurrentAccount(var ano:Int,var nam:String,var minBal:Float)
{
     var accNo:Int=ano
     var name:String=nam
     var balance:Float=minBal
     var minBalance:Float=minBal

     def withdraw()
     {
          println("Enter the amount to be withdraw:")
          var amt:Float=scala.io.StdIn.readFloat()
          if((balance-amt)>=minBalance)
           {
                  println("Balance withdraw successfully:")
     balance=balance-amt
                  println("Remaining Balance="+balance)
           }
           else
           {
                  println("you can only withdraw amount greater than minBalance i.e."+minBalance)
           }
     }
 
      def deposit()
      {
            println("Balance before deposit is="+balance)
            println("Enter the amount to deposit:")
            var amt=scala.io.StdIn.readFloat()
            balance=balance+amt
            println("Balance after deposit="+balance)
      }
       
      def viewBalance()
      {
        println("Account Balance="+balance)
      }
}
object CurrentAccountDemo
{
 def main(args:Array[String]):Unit=
    {
         println("Create New Account For Customer:")
         println("Enter the account number:")
         var ano=scala.io.StdIn.readInt()
         println("Enter the account holder name:")
         var nam=scala.io.StdIn.readLine()
         println("Enter the account minimum balance:")
         var min=scala.io.StdIn.readFloat()
          
         var obj=new CurrentAccount(ano,nam,min)
         var op=4
         do
         {
         println("1.withdraw")
         println("2.deposit")
         println("3.viewBalance")
         println("4.exit")
         println("Enter the operation you want to perform:")
            op=scala.io.StdIn.readInt()
            op match {
            case 1 =>obj.withdraw()
            case 2 =>obj.deposit()
            case 3 =>obj.viewBalance()
            case whoa =>println("Unexpected case:"+whoa.toString)
          }
         }while(op!=4);
        }
}