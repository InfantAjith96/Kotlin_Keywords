package modifier_keywords

inline fun execute(crossinline block: () -> Unit) {
    println("Before")
    block()
    println("After")
}

/**
 * Used in lambdas to prevent non-local returns.
 */
fun main() {
    // Calling the 'execute' function with a lambda as the 'block' argument
    execute {
        println("Inside block")
    }
}