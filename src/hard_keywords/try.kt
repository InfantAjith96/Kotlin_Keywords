package hard_keywords

/**
 * Used for exception handling.
 */
fun main() {
    try {
        val result = 10 / 0
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero")
    }
}