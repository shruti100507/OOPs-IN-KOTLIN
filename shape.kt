/*Create a base class ‘Shape’ with function area(). Override it in circle and rectangle. 
Store objects in a list of Shape and call area() for each. */
open class Shape {
    open fun area(): Double {
        return 0.0
    }
}
class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return 3.14 * radius * radius
    }
}
class Rectangle(val length: Double, val breadth: Double) : Shape() {
    override fun area(): Double {
        return length * breadth
    }
}
fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Rectangle(10.0, 5.0),
        Circle(3.0),
        Rectangle(8.0, 4.0)
    )
    for (shape in shapes) {
        println("Area: ${shape.area()}")
    }
}