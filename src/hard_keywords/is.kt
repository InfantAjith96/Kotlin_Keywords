package hard_keywords

/**
 * Type checking operator.
 */
fun main() {
    val number: Any = 42
    if (number is Int) {
        println("It's an Int")
    }
}