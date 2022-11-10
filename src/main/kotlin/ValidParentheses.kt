import java.util.ArrayDeque

fun main(args: Array<String>) {
    val result = isValid("()[]{}")
    println(result)
}

fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()
    s.forEach {
        when (it) {
            '(', '[', '{' -> stack.push(it)
            ')' -> if (stack.poll() != '(') return false
            '}' -> if (stack.poll() != '{') return false
            ']' -> if (stack.poll() != '[') return false
        }
    }

    return stack.isEmpty()
}