package hard_keywords

/**
 * Refers to the superclass implementation.
 */
open class Animal {
    open fun sound() {
        println("Animal sound")
    }
}

class Dog : Animal() {
    override fun sound() {
        super.sound() // Calls Animal's sound()
        println("Woof")
    }
}

fun main() {
}