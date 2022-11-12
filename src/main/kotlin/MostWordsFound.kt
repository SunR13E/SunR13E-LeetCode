fun main(args: Array<String>) {
    val result = mostWordsFound(arrayOf("alice and bob love leetcode", "i think so too", "this is great thanks very much"))
    println(result)
}

fun mostWordsFound(sentences: Array<String>): Int {
    return sentences.map { it.count { char -> char == ' ' } + 1 }.maxOf { it }
}