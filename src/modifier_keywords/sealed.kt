package modifier_keywords

/**
 * Defines a sealed class to restrict inheritance.
 */
sealed class Shape
class Circle(val radius: Double) : Shape()
class Rectangle(val width: Double, val height: Double) : Shape()

fun printShapeDetails(shape: Shape) {
    // Use 'when' to handle the different types of Shape
    when (shape) {
        is Circle -> println("Circle with radius: ${shape.radius}")
        is Rectangle -> println("Rectangle with width: ${shape.width} and height: ${shape.height}")
    }
}

fun main() {
    val circle = Circle(5.0)
    val rectangle = Rectangle(4.0, 6.0)

    // Print details of the shapes
    printShapeDetails(circle)      // Output: Circle with radius: 5.0
    printShapeDetails(rectangle)   // Output: Rectangle with width: 4.0 and height: 6.0
}