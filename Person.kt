//Create a base class ‘Person’. Derive ‘Teacher’ and ‘Student’ classes from it.
open class Person {
    fun displayPerson() {
        println("This is a person.")
    }
}
class Teacher : Person() {
    fun teach() {
        println("Teacher is teaching.")
    }
}
class Student : Person() {
    fun study() {
        println("Student is studying.")
    }
}
fun main() {
    val teacher = Teacher()
    val student = Student()
    println("Teacher Details:")
    teacher.displayPerson()
    teacher.teach()
    println("\nStudent Details:")
    student.displayPerson()
    student.study()
}