package soft_keywords

/**
 * Used to define code that executes after a try block, regardless of whether an exception is thrown.
 *
 *
 */
fun main() {
    try {
        val result = 10 / 2
    } catch (e: ArithmeticException) {
        println("Caught an exception")
    } finally {
        println("This will always execute")
    }
}