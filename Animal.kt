/*Create a base class ‘Animal’ with functions eat() and sleep(). 
Create a derived class ‘Dog’ and adds bark().*/
open class Animal {
    fun eat() {
        println("Animal is eating.")
    }
    fun sleep() {
        println("Animal is sleeping.")
    }
}
class Dog : Animal() {
    fun bark() {
        println("Dog is barking.")
    }
}
fun main() {
    val dog = Dog()
    dog.eat()
    dog.sleep()
    dog.bark()
}