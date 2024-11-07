package modifier_keywords

/**
 * Overrides a superclass method.
 */
open class Animal4 {
    open fun sound() {}
}

class Dog2 : Animal4() {
    override fun sound() = println("Bark")
}

fun main() {
    val obj = Dog2()
    obj.sound()
}
