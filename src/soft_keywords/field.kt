package soft_keywords

/**
 * Used in a property’s custom getter or setter to refer to the backing field.
 */
class Persons {
    var age: Int = 0
        get() = field
        set(value) {
            field = if (value > 0) value else 0
        }
}

fun main() {
    val person = Persons()
    person.age = -5
    println(person.age)  // Output: 0
}
