fun main(args: Array<String>) {
    val result = countPoints("B0B6G0R6R0R6G9")
    println(result)
}

fun countPoints(rings: String): Int {
    var result = 0
    val resultList = mutableListOf<MutableList<Char>>()
    val reversed = rings.reversed()
    val rod = mutableListOf<Int>()

    for (i in reversed.indices) {
        if (reversed[i].isDigit()) {
            val label = reversed[i].toString().toInt()
            if (!rod.any { it ==  label}) {
                rod.add(label)
                resultList.add(mutableListOf())
            }
            val section = resultList[rod.indexOfFirst { it == label }]
            section.add(reversed[i + 1])
        }
    }

    resultList.forEach {
        if (it.any { it == 'R' } && it.any { it == 'G' } && it.any { it == 'B' }) result ++
    }

    return result
}