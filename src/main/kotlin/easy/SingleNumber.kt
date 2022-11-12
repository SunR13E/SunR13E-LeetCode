fun main(args: Array<String>) {
    val result = singleNumber(intArrayOf(4,1,2,1,2))
    println(result)
}

fun singleNumber(nums: IntArray): Int {
    var result = 0
    var index = 0
    nums.sort()
    do {
        when {
            index == nums.lastIndex -> {
                result = nums[index]
                index = nums.size
            }
            nums[index] == nums[index + 1] -> {
                index += 2
            }
            else -> {
                result = nums[index]
                index = nums.size
            }
        }
    } while (index <= nums.lastIndex)

    return result
}