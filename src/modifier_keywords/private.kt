package modifier_keywords

/**
 * Restricts visibility within the same class.
 */
class MyClass2 {
    private val secret = "hidden"

    // Add a public method to access the 'secret' property
    fun getSecret(): String {
        return secret
    }
}

/**
 * In Kotlin, the secret property in your MyClass2 class is marked as private, meaning it is only accessible within the class itself. If you want to print the secret property from outside the class (for example, in the main function), you need to provide some way to access it.
 */
fun main() {
    val myClass = MyClass2()

    // Call the public method to get the 'secret' value
    println(myClass.getSecret())  // Output: hidden
}