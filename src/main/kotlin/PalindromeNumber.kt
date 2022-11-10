fun main(args: Array<String>) {
    val result = palindrome(9339)
    println(result)
}

fun palindrome(x: Int): Boolean {
    var result = false
    when {
        x < 0 -> result = false
        x < 10 -> result = true
        x % 10 == 0 -> result = false
        else -> {
            var desc = x
            val list = arrayListOf<Int>()
            var isPoly = false
            do {
                list.add(desc % 10)
                desc /= 10
            } while (desc != 0)
            var subList = list
            if (list.size % 2 != 0) {
                val removedIndex = (list.size - 1) / 2
                subList.removeAt(removedIndex)
            }
            val firstPart = subList.drop(subList.size / 2)
            val lastPart = subList.dropLast(subList.size / 2).reversed()
            if (firstPart == lastPart) {
                isPoly = true
            }
            result = isPoly
        }

    }
    return result
}