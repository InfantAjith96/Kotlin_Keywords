package soft_keywords

/**
 * Specifies the receiver in an extension function type.
 */
val stringPlus: String.(Int) -> String = { this + it }

fun main() {
    println("Hello".stringPlus(5))  // Output: Hello5
}
