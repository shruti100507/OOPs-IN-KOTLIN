/*Create an interface ‘Shape’ with function area(). 
Implement it in circle and rectangle classes. */
interface Shape {
    fun area(): Double
}
class Circle(val radius: Double) : Shape {
    override fun area(): Double {
        return 3.14 * radius * radius
    }
}
class Rectangle(val length: Double, val breadth: Double) : Shape {
    override fun area(): Double {
        return length * breadth
    }
}
fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(10.0, 5.0)
    println("Area of Circle: ${circle.area()}")
    println("Area of Rectangle: ${rectangle.area()}")
}