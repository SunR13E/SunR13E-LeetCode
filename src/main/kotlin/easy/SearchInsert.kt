fun main(args: Array<String>) {
    val result = searchInsert(intArrayOf(2,6,1,3), 9)
    println(result)
}

fun searchInsert(nums: IntArray, target: Int): Int {
    val index = nums.indexOfFirst { it == target }
    val higherValue = nums.indexOfFirst { it >= target }
    return when {
        index > -1 -> index
        higherValue == 0 -> 0
        higherValue > -1 -> higherValue - 1
        else -> nums.lastIndex + 1
    }
}