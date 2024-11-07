package modifier_keywords

/**
 * Allows a class or method to be overridden.
 */
open class Animal3 {
    open fun makeSound() {}
}

/**
 * In Kotlin, the Animal3 class has an open method makeSound(), which means it can be overridden by subclasses. However, in its current form, the makeSound() method does nothing (it has an empty body), so there's nothing to print.
 *
 * To print something when calling makeSound(), you would need to override the makeSound() method in a subclass, and then provide a concrete implementation that prints something.
 */
class Dog3 : Animal3() {
    override fun makeSound() {
        // Print a sound specific to Dog
        println("Woof! Woof!")
    }
}

fun main() {
    val dog = Dog3()
    dog.makeSound()  // Output: Woof! Woof!
}