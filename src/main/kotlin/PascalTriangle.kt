fun main(args: Array<String>) {
    val result = pascalTriangle(5)
    println(result)
}

fun pascalTriangle(numRows: Int): List<List<Int>> {
    when (numRows) {
        1 -> return listOf(listOf(1))
        2 -> return listOf(listOf(1), listOf(1, 1))
        else -> {
            val result = mutableListOf(listOf(1), listOf(1, 1))
            var count = 2
            do {
                val list = mutableListOf(1)
                val lastList = result[result.lastIndex]
                for (i in lastList.indices) {
                    if (i == lastList.lastIndex) {
                        list.add(1)
                    } else {
                        list.add(lastList[i] + lastList[i + 1])
                    }
                }
                result.add(list)
                count ++
            } while (count < numRows)
            return result
        }
    }
}