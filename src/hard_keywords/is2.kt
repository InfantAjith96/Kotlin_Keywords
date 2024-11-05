package hard_keywords

/**
 * Negated type checking.
 */
fun main() {
    val number: Any = "String"
    if (number !is Int) {
        println("Not an Int")
    }
}