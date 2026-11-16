/*Create a class ‘Student’ with name and roll number. 
Add a function introduce() that prints students details. */
class Student(
    val name: String,
    val rollNumber: Int
) {
    fun introduce() {
        println("Student Name: $name")
        println("Roll Number: $rollNumber")
    }
}
fun main() {
    val student1 = Student("Shruti", 101)
    student1.introduce()
}