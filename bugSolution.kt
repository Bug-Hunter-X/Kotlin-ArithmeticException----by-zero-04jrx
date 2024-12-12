```kotlin
fun calculate(a: Int, b: Int): Int {
    return if (b == 0) {
        0 // Or throw an exception: throw ArithmeticException("Division by zero")
    } else {
        a / b
    }
}

fun main() {
    val result = calculate(10, 0)
    println(result) // Output: 0
    val result2 = calculate(10,2)
    println(result2) // Output: 5
}
```