fun main(args: Array<String>) {
    val result = validPalindrome("A man, a plan, a canal: Panama")
    println(result)
}

fun validPalindrome(s: String): Boolean {
    val string = s.toLowerCase().filter { it.isLetter() || it.isDigit() }
    return string == string.reversed()
}