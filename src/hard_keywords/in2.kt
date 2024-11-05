package hard_keywords

/**
 * Checks if an element is not in a collection or range.
 */
fun main() {
    val number = 7
    if (number !in 1..5) {
        println("Out of range")
    }
}