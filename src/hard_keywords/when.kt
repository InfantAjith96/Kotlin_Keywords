package hard_keywords

/**
 * Conditional expression similar to switch in other languages.
 */
fun main() {
    val day = 3
    val dayName = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else -> "Invalid day"
    }
}