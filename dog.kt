/*Create a list of Animal objects (Dog Cat etc)
and call makeSound() using polymorphism.*/
open class Animal {
    open fun makeSound() {
        println("Animal makes a sound.")
    }
}
class Dog : Animal() {
    override fun makeSound() {
        println("Dog barks: Woof Woof!")
    }
}
class Cat : Animal() {
    override fun makeSound() {
        println("Cat meows: Meow Meow!")
    }
}
class Cow : Animal() {
    override fun makeSound() {
        println("Cow moos: Moo Moo!")
    }
}
fun main() {
    val animals: List<Animal> = listOf(
        Dog(),
        Cat(),
        Cow()
    )
    for (animal in animals) {
        animal.makeSound()
    }
}