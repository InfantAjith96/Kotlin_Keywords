package modifier_keywords

/**
 * Used to suggest the compiler inline a function to reduce overhead.
 */
inline fun perform(action: () -> Unit) {
    action()
}

/**
 * To print something using the perform function that you provided, you just need to call perform in the main function and pass a lambda (action) to it. Inside the lambda, you can put the code that prints the desired output.
 */
fun main() {
    // Calling perform and passing a lambda that prints a message
    perform {
        println("Hello, Kotlin!")
    }
}