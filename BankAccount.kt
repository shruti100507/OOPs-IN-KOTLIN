/*Create a class ‘BankAccount’ with the private balance variable. 
Add functions deposit() withdraw() and getBalance(). 
Ensure balance cannot come negative. */
class BankAccount {
    private var balance: Double = 0.0
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("₹$amount deposited successfully.")
        } else {
            println("Invalid deposit amount.")
        }
    }
    fun withdraw(amount: Double) {
        if (amount <= 0) {
            println("Invalid withdrawal amount.")
        } else if (amount > balance) {
            println("Insufficient balance!")
        } else {
            balance -= amount
            println("₹$amount withdrawn successfully.")
        }
    }
    fun getBalance(): Double {
        return balance
    }
}
fun main() {
    val account = BankAccount()
    account.deposit(5000.0)
    account.withdraw(2000.0)
    println("Current Balance: ₹${account.getBalance()}")
   account.withdraw(4000.0)
    println("Final Balance: ₹${account.getBalance()}")
}