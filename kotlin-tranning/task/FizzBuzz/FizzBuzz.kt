fun main(args: Array<String>) {
    for (num in 1..100) {
        if (num % 15 == 0) {
            println("FizzBuzz")
        } else if (num % 3 == 0) {
            println("Fizz")
        } else if (num % 5 == 0) {
            println("Buzz")
        }
    }
}
