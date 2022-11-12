fun main(args: Array<String>) {
    val result = runningSumOf1DArray(intArrayOf(0,1,0,3,12))
    println(result)
}

fun runningSumOf1DArray(nums: IntArray): IntArray {
    var sum = 0
    for (i in nums.indices) {
        sum += nums[i]
        nums[i] = sum
    }
    return nums
}