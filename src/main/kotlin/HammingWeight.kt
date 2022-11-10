fun main(args: Array<String>) {
    val result = hammingWeight(1111111011)
    println(result)
}

fun hammingWeight(n:Int):Int {
    return Integer.toBinaryString(n).replace("0", "").length
}