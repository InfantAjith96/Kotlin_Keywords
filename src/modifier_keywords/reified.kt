package modifier_keywords

/**
 * Used in inline functions with type parameters to retain type information.
 */
inline fun <reified T> isOfType(value: Any) = value is T

fun main() {
    val number = 42
    val text = "Hello, Kotlin!"

    // Check if 'number' is of type Int
    println(isOfType<Int>(number))  // Output: true

    // Check if 'text' is of type String
    println(isOfType<String>(text))  // Output: true

    // Check if 'number' is of type String
    println(isOfType<String>(number))

    // Check if 'text' is of type Int
    println(isOfType<Int>(text))
}