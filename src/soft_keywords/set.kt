package soft_keywords

/**
 * Defines a custom setter for a property.
 */
class Rectangle {
    var width: Int = 0
        set(value) {
            field = if (value > 0) value else 0
        }
}

fun main() {
    val rectangle = Rectangle()
    rectangle.width = -10
    println(rectangle.width)  // Output: 0
}