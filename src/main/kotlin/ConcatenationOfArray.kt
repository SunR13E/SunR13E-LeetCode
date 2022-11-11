fun main(args: Array<String>) {
    val result = concatenationOfArray(intArrayOf(0,1,0,3,12))
    println(result)
}

fun concatenationOfArray(nums: IntArray): IntArray {
    val result = mutableListOf<Int>()
    for (i in 0..1) {
        nums.forEach {
            result.add(it)
        }
    }
    return result.toIntArray()
}