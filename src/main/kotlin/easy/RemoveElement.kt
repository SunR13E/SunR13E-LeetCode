fun main(args: Array<String>) {
    val result = removeElement(intArrayOf(2,6,1,3), 9)
    println(result)
}

fun removeElement(nums: IntArray, `val`: Int): Int {
    for (i in nums.indices) {
        if (nums[i] == `val`) {
            nums[i] = -1
        }
    }
    nums.sortDescending()
    return nums.filter { it != -1 }.size
}