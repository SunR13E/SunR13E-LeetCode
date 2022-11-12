fun main(args: Array<String>) {
    val result = twoSum(intArrayOf(2,6,1,3), 9)
    println(result.joinToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var isFounded = false
    val lastIndex = nums.size - 1
    var firstIndex = 0
    var secondIndex = 1
    do {
        val sum = nums[firstIndex] + nums[secondIndex]
        when {
            sum != target && secondIndex == lastIndex -> {
                firstIndex += 1
                secondIndex = firstIndex + 1
            }
            sum != target -> {
                secondIndex += 1
            }
            else -> {
                isFounded = true
            }
        }
    } while (!isFounded)
    return intArrayOf(firstIndex, secondIndex)
}