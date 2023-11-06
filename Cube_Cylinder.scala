abstract class Shape{
var vol:Float=0.0f
def volume()
def display()
}

class Cube extends Shape{
def volume()
{
println("Enter the length of cube")
var l=scala.io.StdIn.readInt()
vol=l*l*l
}

def display()
{
println("Volume of cube="+vol)
}
}

class Cylinder extends Shape{
def volume()
{
println("Enter radius of Cylinder: ")
var rad=scala.io.StdIn.readInt()

println("Enter height of Cylinder: ")
var ht=scala.io.StdIn.readInt()

vol=3.14f*rad*rad*ht
}

def display()
{
println("Volume of Cylinder="+vol)
}
}


object Cube_Cylinder{
def main(args:Array[String])
{
var c=new Cube()
c.volume()
c.display()

var cy= new Cylinder()
cy.volume()
cy.display()

}

}
