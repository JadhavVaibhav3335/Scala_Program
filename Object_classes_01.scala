class CurrentAccount(accNo: Int, name: String, var balance: Double, minBalance: Double) {
  def withdraw(amount: Double): Unit = {
    if (balance - amount >= minBalance) {
      balance -= amount
      println(s"Withdrew $amount. New balance: $balance")
    } else {
      println("Insufficient balance. Withdrawal not allowed.")
    }
  }

  def deposit(amount: Double): Unit = {
    balance += amount
    println(s"Deposited $amount. New balance: $balance")
  }

  def viewBalance(): Unit = {
    println(s"Account Number: $accNo")
    println(s"Account Holder: $name")
    println(s"Current Balance: $balance")
    println(s"Minimum Balance: $minBalance")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    println("Enter Account Number: ")
    val accNo = scala.io.StdIn.readInt()

    println("Enter Account Holder Name: ")
    val name = scala.io.StdIn.readLine()

    println("Enter Initial Balance: ")
    val initialBalance = scala.io.StdIn.readDouble()

    println("Enter Minimum Balance: ")
    val minBalance = scala.io.StdIn.readDouble()

    val account = new CurrentAccount(accNo, name, initialBalance, minBalance)

    println("Account created successfully!")

    var choice = 0
    while (choice != 4) {
      println("\nChoose an option:")
      println("1. Withdraw")
      println("2. Deposit")
      println("3. View Balance")
      println("4. Exit")
      print("Enter your choice: ")
      choice = scala.io.StdIn.readInt()

      choice match {
        case 1 =>
          println("Enter the withdrawal amount: ")
          val withdrawalAmount = scala.io.StdIn.readDouble()
          account.withdraw(withdrawalAmount)
        case 2 =>
          println("Enter the deposit amount: ")
          val depositAmount = scala.io.StdIn.readDouble()
          account.deposit(depositAmount)
        case 3 =>
          account.viewBalance()
        case 4 =>
          println("Exiting...")
        case _ =>
          println("Invalid choice. Please enter a valid option.")
      }
    }
  }
}
