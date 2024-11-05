/**
 * The by keyword is often used in delegation.
 * */
interface Base {
    fun printMessage()
}

class BaseImpl(val message: String) : Base {
    override fun printMessage() = println(message)
}

class Derived(b: Base) : Base by b

fun main() {
    val base = BaseImpl("Hello from BaseImpl")
    val derived = Derived(base)
    derived.printMessage()  // Output: Hello from BaseImpl
}