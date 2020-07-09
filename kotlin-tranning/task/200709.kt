fun factorial(number: Long): Long {
    if (number == 0L) return 1L
    else  return number * factorial(number - 1L)
}

fun main(args: Array<String>) {
    val n = 10L
    println(factorial(n))
}

