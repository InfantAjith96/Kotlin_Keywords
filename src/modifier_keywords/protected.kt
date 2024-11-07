package modifier_keywords

/**
 * Restricts visibility to the same class and subclasses.
 */
open class Animals {
    protected fun makeSound() = "Animal sound"
}

class Dogs : Animals() {
    fun bark() = makeSound()
}

fun main() {
    val obj = Dogs().bark()
    println(obj)
}

