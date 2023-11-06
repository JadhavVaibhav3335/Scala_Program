class Employee_Max_Sal()
{
var Empid:Int=0
var Empname:String=" "
var Empsal:Double=0.0


def accept()
{
println("Enter Employee id: ")
Empid=scala.io.StdIn.readInt()

println("Enter Employee Name: ")
Empname=scala.io.StdIn.readLine()

println("Enter Employee Salary: ")
Empsal=scala.io.StdIn.readDouble()

}

def display()
{
println(Empid+" "+Empname+" "+Empsal)
}
}

object Employee
{
def main(args:Array[String])
{
println("How many records you want to enter ")
var n=scala.io.StdIn.readInt()
var emp=new Array[Employee_Max_Sal](n)
var id=0
var sal:Double=0
var name=" "

for(i<-0  until n)
{
emp(i)=new Employee_Max_Sal()
emp(i).accept()

}


var max:Double=0.0
for(i<-0 until n)
{
if(emp(i).Empsal>max)
max=emp(i).Empsal
}

println("Maximum Salary employee records:")
for(i<-0 until n )
{
if(max.equals(emp(i).Empsal))
emp(i).display()
}

}


}


