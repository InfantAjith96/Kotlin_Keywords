package hard_keywords

/**
 * Terminates the nearest enclosing loop.
 */
fun main() {
    for (i in 1..5) {
        if (i == 3) break
        println(i)
    }
}