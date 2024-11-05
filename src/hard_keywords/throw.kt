package hard_keywords

/**
 * Throws an exception.
 */
fun checkAge(age: Int) {
    if (age < 18) throw IllegalArgumentException("Underage")
}
