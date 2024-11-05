/**
* A soft keyword for dynamic typing in Kotlin/JS.
*/
// Only works in Kotlin/JS
external fun require(module: String): dynamic

fun main() {
    val os = require("os")
    println(os.platform())
}
