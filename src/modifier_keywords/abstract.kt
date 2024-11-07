package modifier_keywords

abstract class Animal {
    abstract fun sound()
}

class Dog1 : Animal() {
    override fun sound() = println("Bark")
}

/**
 * Used in classes or methods to define something that must be implemented by subclasses.
 */
fun main() {
    val obj = Dog1()
    obj.sound()
}