package soft_keywords

/**
 * Defines a constructor for a class.
 */
class Person constructor(val name: String)

fun main() {
    val person = Person("John")
    println(person.name)  // Output: John
}
