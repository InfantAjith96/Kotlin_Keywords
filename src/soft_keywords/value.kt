package soft_keywords

/**
 * Refers to the value of a property in a setter or annotation constructor.
 */
class Example2 {
    var name: String = ""
        set(value) {
            field = value.uppercase()
        }
}

fun main() {
    val example = Example2()
    example.name = "hello"
    println(example.name)  // Output: HELLO
}