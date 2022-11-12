fun main(args: Array<String>) {
    val result = lengthOfLastWord("   fly me   to   the moon  ")
    println(result)
}

fun lengthOfLastWord(s: String): Int {
    val array = s.toCharArray().reversed().toTypedArray()
    if (!array.any { it == ' ' }) return array.size
    val startIndex = array.indexOfFirst { it != ' ' }
    for (i in startIndex..array.lastIndex) {
        if (array[i] == ' ') {
            array[i] = '_'
        }
    }
    val endIndex = array.indexOfFirst { it == '_' }
    val result = if (endIndex == -1) {
        array.lastIndex - startIndex + 1
    } else {
        endIndex - startIndex
    }
    return if (result == 0) 1 else result
}