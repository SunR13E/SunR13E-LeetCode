import java.math.BigInteger

fun main(args: Array<String>) {
    val result = plusOne(intArrayOf(1,2,3))
    println(result)
}

fun plusOne(digits: IntArray): IntArray {
    return (digits.joinToString("").toBigInteger() + BigInteger.ONE)
        .toString()
        .toCharArray()
        .map { it.toString().toInt() }
        .toIntArray()
}