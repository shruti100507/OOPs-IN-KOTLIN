/*Create a class ‘Rectangle’ with length and breadth. 
Add the function area() to calculate the area.*/
class Rectangle(
    val length: Double,
    val breadth: Double
) {
    fun area(): Double {
        return length * breadth
    }
}

fun main() {

    val rectangle1 = Rectangle(10.0, 5.0)
    println("Length: ${rectangle1.length}")
    println("Breadth: ${rectangle1.breadth}")
    println("Area of Rectangle: ${rectangle1.area()}")
}