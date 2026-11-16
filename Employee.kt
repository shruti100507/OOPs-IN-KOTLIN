/*Create a class 'Employee' with a private salary.
Add setter and getter functions with validation.*/
class Employee {
    private var salary: Double = 0.0
    fun setSalary(amount: Double) {
        if (amount > 0) {
            salary = amount
            println("Salary updated successfully.")
        } else {
            println("Invalid salary! Salary must be greater than zero.")
        }
    }
    fun getSalary(): Double {
        return salary
    }
}
fun main() {
    val emp = Employee()
    emp.setSalary(30000.0)
    println("Employee Salary: Rs.${emp.getSalary()}")
    emp.setSalary(-5000.0)
    println("Current Salary: Rs.${emp.getSalary()}")
}