fun main(args: Array<String>) {
    val result = romanToInteger("MDCXCV")
    println(result.toString())
}

fun romanToInteger(s: String): Int {
    var result = 0
    var index = 0
    val list = s
        .toCharArray()
        .map {
            when (it.toString()) {
                "I" -> 1
                "V" -> 5
                "X" -> 10
                "L" -> 50
                "C" -> 100
                "D" -> 500
                else -> 1000
            }
        }

    do {
        val first = list[index]
        val second = if (index != list.lastIndex) {
            list[index + 1]
        } else {
            0
        }
        when {
            first == 1 && (second == 5 || second == 10) -> {
                result += second - first
                index += 2
            }

            first == 10 && (second == 50 || second == 100) -> {
                result += second - first
                index += 2
            }

            first == 100 && (second == 500 || second == 1000) -> {
                result += second - first
                index += 2
            }

            else -> {
                result += first
                index++
            }
        }
    } while (index <= list.lastIndex)

    return result
}