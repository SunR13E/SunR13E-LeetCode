fun main(args: Array<String>) {
    val result = moveZeroes(intArrayOf(0,1,0,3,12))
    println(result)
}


fun moveZeroes(nums: IntArray): String {
    var isSorted = false
    do {
        for (i in nums.indices) {
            when {
                i == nums.lastIndex -> isSorted = true
                nums[i] == 0 && nums[i + 1] != 0 -> {
                    nums[i] = nums[i + 1]
                    nums[i + 1] = 0
                }
                else -> {
                    for (j in i..nums.lastIndex) {
                        if (nums[j] != 0) {
                            nums[i] = nums[j]
                            nums[j] = 0
                            break
                        }
                    }
                }
            }
        }
    } while (!isSorted)
    return nums.joinToString()
}