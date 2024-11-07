package modifier_keywords

class MyClass {
    companion object {
        fun greet() = "Hello"
    }
}

/**
 * Defines a companion object that acts as a singleton within a class.
 */
fun main() {
    println(MyClass.greet())
}