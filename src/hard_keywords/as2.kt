package hard_keywords

/**
 * Safe casting operator that returns null if casting fails.
 */
val number2: Any = "NotAnInt"
val intNumber2 = number2 as? Int // intNumber will be null
