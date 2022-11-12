fun main(args: Array<String>) {
    val result = defangIPaddr("1.1.1.1")
    println(result)
}

fun defangIPaddr(address: String): String {
    return address.replace(".", "[.]")
}