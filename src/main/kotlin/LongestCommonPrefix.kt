fun main(args: Array<String>) {
    val result = longestCommonPrefix(arrayOf("flower","flow","flight","flower","flow","flight"))
    println(result)
}

fun longestCommonPrefix(strs: Array<String>): String {
    var isFounded = false
    var index = 0
    val result = arrayListOf<String>()
    var resultAsString = ""
    val array = strs
        .map { str ->
            str
                .toCharArray()
                .map { it.toString() }
                .toTypedArray()
        }
    do {
        val firstWord = array[0]
        if (index <= firstWord.lastIndex) result.add(firstWord[index])
        array.forEach {
            when {
                index > result.lastIndex -> {
                    isFounded = true
                }
                index > it.lastIndex -> {
                    result.removeAt(index)
                    isFounded = true
                }
                it[index] != result[index] -> {
                    result.removeAt(index)
                    isFounded = true
                }
            }
        }
        index ++
    } while (!isFounded)
    result.forEach {
        resultAsString += it
    }
    return resultAsString
}