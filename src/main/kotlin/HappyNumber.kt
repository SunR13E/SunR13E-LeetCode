fun main(args: Array<String>) {
    val result = happyNumber(19)
    println(result)
}

fun happyNumber(n:Int):Boolean {
    if (n == 1) return true
    var array = n.toString().toCharArray().map { it.toString().toInt() }.toTypedArray()
    var result: Int
    var isLooped = false
    val seenValue = mutableListOf<Int>()
    do {
        var sum = 0
        for (i in array.indices) {
            sum += array[i] * array[i]
        }
        array = sum.toString().toCharArray().map { it.toString().toInt() }.toTypedArray()
        result = sum
        if (seenValue.any { it == sum }) {
            isLooped = true
        } else {
            seenValue.add(sum)
        }
    } while (!isLooped)

    return result == 1
}