package modifier_keywords

/**
 * Allows property initialization after object construction, used with var.
 */
lateinit var name: String

fun main() {
    name = "Hello"
    println(name)
}