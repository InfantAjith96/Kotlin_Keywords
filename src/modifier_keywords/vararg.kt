package modifier_keywords

/**
 * Allows a variable number of arguments in a function.
 */
fun printAll(vararg messages: String) {
    for (message in messages) println(message)
}

fun main() {
    printAll("Hello", "Kotlin", "is", "awesome!")
}