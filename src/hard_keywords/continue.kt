package hard_keywords

/**
 * Skips the current iteration of the nearest enclosing loop.
 */
fun main() {
    for (i in 1..5) {
        if (i == 3) continue
        println(i)
    }
}