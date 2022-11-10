import kotlin.math.sqrt

fun main(args: Array<String>) {
    val result = mySqrt(9)
    println(result)
}

fun mySqrt(x: Int): Int {
    return sqrt(x.toDouble()).toInt()
}