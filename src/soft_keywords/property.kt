package soft_keywords

/**
 * Used in annotations to refer to properties.
 */
annotation class MyAnnotation2(val property: String)

class MyClass2(@property:MyAnnotation2("example") val value: String)
