class Employee(id: Int, name: String, var salary: Double) {
  def accept(): Unit = {
    println("Enter Employee ID: ")
    val empId = scala.io.StdIn.readInt()
    println("Enter Employee Name: ")
    val empName = scala.io.StdIn.readLine()
    println("Enter Employee Salary: ")
    val empSalary = scala.io.StdIn.readDouble()

    id = empId
    name = empName
    salary = empSalary
  }

  def display(): Unit = {
    println(s"Employee ID: $id")
    println(s"Employee Name: $name")
    println(s"Employee Salary: $salary")
  }
}

object EmployeeApp {
  def main(args: Array[String]): Unit = {
    val numEmployees = 3 // You can change this to the number of employees you want to work with
    val employees = new Array[Employee](numEmployees)

    for (i <- 0 until numEmployees) {
      println(s"Enter details for Employee ${i + 1}:")
      val employee = new Employee(0, "", 0.0)
      employee.accept()
      employees(i) = employee
    }

    // Find the employee with the maximum salary
    val maxSalaryEmployee = employees.maxBy(_.salary)

    println("\nEmployee with the maximum salary:")
    maxSalaryEmployee.display()
  }
}
