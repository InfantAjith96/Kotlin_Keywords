package soft_keywords

/**
 * A soft keyword in annotations to refer to parameters.
 */
annotation class MyAnnotation1(val param: String)

class MyClass1 @MyAnnotation1("example") constructor(val value: String)
