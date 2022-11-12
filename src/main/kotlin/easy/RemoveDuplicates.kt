fun main(args: Array<String>) {
    val result = removeDuplicates(intArrayOf(1,1,2,3,3,4,5,6,7,8,9,9,9,9,9))
    println(result)
}

fun removeDuplicates(nums: IntArray): Int {
    var j = 0
    for (i in nums.indices) {
        if (nums[i] != nums[j]) {
            nums[++j] = nums[i]
        }
    }
    return ++j
}
