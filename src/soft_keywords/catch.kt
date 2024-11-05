package soft_keywords

/**
* Used to handle exceptions in a try-catch block.
*/
fun main() {
    try {
        val result = 10 / 0
    } catch (e: ArithmeticException) {
        println("Caught an exception: ${e.message}")
    }
}
