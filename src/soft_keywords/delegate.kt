package soft_keywords

import kotlin.reflect.KProperty

/**
 * Used in property delegation.
 */
class Example {
    var prop: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>) = "Hello, delegate!"
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

fun main() {
    val example = Example()
    println(example.prop)  // Output: Hello, delegate!
    example.prop = "Goodbye"
}
