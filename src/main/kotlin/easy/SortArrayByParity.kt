fun main(args: Array<String>) {
    val result = sortArrayByParity(intArrayOf(3,1,2,4))
    println(result)
}

fun sortArrayByParity(nums: IntArray): IntArray {
    val even = nums.filter { it % 2 == 0 }
    val odd = nums.filter { it % 2 != 0 }
    return (even + odd).toIntArray()
}