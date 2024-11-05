package soft_keywords

annotation class MyAnnotation3(val info: String)

class MyClass3 {
    var value: String = ""
        //@setparam:MyAnnotation3("example") set
}
