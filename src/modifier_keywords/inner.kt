package modifier_keywords

/**
 * Allows access to outer class members in a nested class.
 */
class Outer {
    val outerValue = "Outer"
    inner class Inner {
        fun printOuter() = println(outerValue)
    }
}

fun main() {
    val obj = Outer()
    obj.Inner().printOuter()
}
