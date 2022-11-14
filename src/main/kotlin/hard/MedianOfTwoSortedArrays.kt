fun main(args: Array<String>) {
    val result = findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4))
    println(result)
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val sortedList = mutableListOf<Int>()

    nums1.forEach {
        sortedList.add(it)
    }
    nums2.forEach {
        sortedList.add(it)
    }
    sortedList.sort()

    return if (sortedList.size % 2 == 0) {
        val index = sortedList.lastIndex / 2
        (sortedList[index] + sortedList[index + 1]) / 2.0
    } else {
        sortedList[sortedList.lastIndex / 2].toDouble()
    }
}