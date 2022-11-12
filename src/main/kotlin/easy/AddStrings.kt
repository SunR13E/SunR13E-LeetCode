fun main(args: Array<String>) {
    val result = addStrings("3876620623801494171", "6529364523802684779")
    println(result)
}

fun addStrings(num1: String, num2: String): String {
    return (num1.toBigInteger() + num2.toBigInteger()).toString()
}