fun main(args: Array<String>) {
    val result = addBinary("11","1")
    println(result)
}

fun addBinary(a: String, b: String): String {
    return (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)
}