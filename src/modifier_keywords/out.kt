package modifier_keywords

/**
 * Defines covariance for generics.
 */
class Box<out T>(val value: T)

fun main() {
    // Create a Box with an integer value
    val box1 = Box(42)
    // Create a Box with a string value
    val box2 = Box("Hello")

    // Print the values stored in the box
    println(box1.value)
    println(box2.value)
}