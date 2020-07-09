fun factorial(number: Int): Int {
    if (number == 0) return 1
    else  return number * factorial(number - 1) 
}

fun main(args: Array<String>) {
    val n = 10
    println(factorial(n))
}

