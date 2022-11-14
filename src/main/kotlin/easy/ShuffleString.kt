fun main(args: Array<String>) {
    val result = restoreString("codeleet", intArrayOf(4,5,6,7,0,2,1,3))
    println(result)
}

fun restoreString(s: String, indices: IntArray): String {
    val result = CharArray(s.length)
    val array = s.toCharArray()
    for(i in indices.indices){
        result[indices[i]] = array[i]
    }
    return result.joinToString("")
}