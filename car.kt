/*Create a class 'Car' with properties: brand, model, and price. 
Create 3 objects and print their details.*/
class Car(
    val brand: String,
    val model: String,
    val price: Double
) {
    fun displayDetails() {
        println("Brand: $brand")
        println("Model: $model")
        println("Price: ₹$price")
        println("----------------------")
    }
}
fun main() {
    val car1 = Car("Toyota", "Fortuner", 3500000.0)
    val car2 = Car("Hyundai", "Creta", 1500000.0)
    val car3 = Car("Tata", "Nexon", 1200000.0)
    println("Car Details:\n")
    car1.displayDetails()
    car2.displayDetails()
    car3.displayDetails()
}
