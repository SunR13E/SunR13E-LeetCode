fun main(args: Array<String>) {
    val result = finalValueAfterOperations(arrayOf("--X","X++","X++"))
    println(result)
}

fun finalValueAfterOperations(operations: Array<String>): Int {
    return operations.map { if (it.any { char -> char == '+' }) 1 else -1 }.sum()
}