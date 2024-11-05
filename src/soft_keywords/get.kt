package soft_keywords

/**
 * Defines a custom getter for a property.
 */
class Circle(val radius: Double) {
    val diameter: Double
        get() = radius * 2
}

fun main() {
    val circle = Circle(5.0)
    println(circle.diameter)  // Output: 10.0
}
