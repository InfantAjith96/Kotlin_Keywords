package soft_keywords

/**
 * Initialization block that’s executed when an instance is created.
 */
class Person1(val name: String) {
    init {
        println("Person initialized with name $name")
    }
}

fun main() {
    val person = Person1("John")  // Output: Person initialized with name John
}
