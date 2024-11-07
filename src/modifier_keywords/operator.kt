package modifier_keywords

/**
 * Defines an operator function for overloading operators.
 */
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) = Point(x + other.x, y + other.y)
}
