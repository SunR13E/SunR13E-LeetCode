fun main(args: Array<String>) {
    val result = kidsWithCandies(intArrayOf(4,2,1,1,2), 3)
    println(result)
}

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
    val biggest = candies.maxOrNull()!!
    return candies.map { it + extraCandies >= biggest }
}