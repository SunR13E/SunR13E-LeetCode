fun main(args: Array<String>) {
    val result = climbStairs(4)
    println(result)
}

fun climbStairs(n: Int): Int {
    tailrec fun recursion(i: Int, first: Int, second: Int): Int =
        if (i == n)
            first + second
        else
            recursion(i + 1, second, first + second)

    return recursion(1, 0, 1)
}