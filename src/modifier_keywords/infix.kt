package modifier_keywords

/**
 * Allows function calls without parentheses or dots.
 */
infix fun Int.times(str: String) = str.repeat(this)
val result = 2 times "Hi "

fun main() {
    println(result)
}