fun main(args: Array<String>) {
    val result = mergeSortedArray(intArrayOf(1,2,3,0,0,0),3,intArrayOf(2,5,6),3)
    println(result)
}

fun mergeSortedArray(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var index = 0
    for (i in nums1.indices) {
        if (nums1[i] == 0 && index <= n) {
            nums1[i] = nums2[index]
            ++index
        }
    }
    nums1.sort()
}