package modifier_keywords

/**
 * Prevents inlining a specific lambda in an inline function.
 */
inline fun execute2(noinline block: () -> Unit) {
    block()
}

/**
 * In Kotlin, you have defined an inline function execute2, which takes a noinline lambda (block). The inline keyword means the lambda will be inlined at the call site, but the noinline modifier means that the lambda cannot be inlined in this specific case.
 *
 * To print something from inside execute2, you need to pass a block (lambda function) that will be executed within execute2. You can then print something inside the lambda that gets passed to execute2.
 */
fun main() {
    // Passing a lambda to execute2
    execute2 {
        println("Hello from the block!")
    }
}