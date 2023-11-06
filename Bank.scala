class Current_Account(val accNo:Int,val name:String,val balance:Int,val minBalance:Int)
{
var ANo:Int=accNo
var Name:String=name
var Bal:Int=balance
var minBal:Int=minBalance

def withdraw(amt:Int)
{
if((Bal-amt)<5000)
println("Can not withdraw")
else
Bal-=amt
println("Balance is="+Bal)
}

def deposit(amt:Int)
{
Bal+=amt
println("Balance is "+Bal)
}

def viewBalance(accNo:Int)
{
println("Balance is "+Bal)
}
}
object Bank
{
 def main(args:Array[String]):Unit=
 {
 var b=new Current_Account(3544575,"Rj",677889,5666)
 b.deposit(5000)
 b.withdraw(10000)
 b.viewBalance(5676778)
 
 }
 
}


