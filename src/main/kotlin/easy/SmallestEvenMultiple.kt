fun main(args: Array<String>) {
    val result = smallestEvenMultiple(3)
    println(result)
}

fun smallestEvenMultiple(n: Int): Int {
    var result = n
    var isFounded = result % n == 0 && result % 2 == 0
    if (isFounded) return result
    do {
        ++result
        isFounded = result % n == 0 && result % 2 == 0
    } while (!isFounded)
    return result
}