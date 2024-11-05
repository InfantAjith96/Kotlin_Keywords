package soft_keywords

/**
 * Used in generic constraints.
 */

//Example: Instead of writing separate functions for lists of integers, strings, and doubles, you can use a generic function:
fun <T> requireNotNull(value: T): T where T : Any {
    return value
}

fun main() {
    val result = requireNotNull("Hello")
    val result2 = requireNotNull(10)
    println(result)  // Output: Hello
    println(result2)  // Output: Hello
}
