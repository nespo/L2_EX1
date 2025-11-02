fun main() {
    val numbers = (1..20).toList()

    val evens = numbers.filter { it % 2 == 0 }

    val squares = numbers.map { it * it }

    val sum = numbers.reduce { acc, n -> acc + n }

    println("Evens: $evens")
    println("Squares: $squares")
    println("Sum: $sum")
}
