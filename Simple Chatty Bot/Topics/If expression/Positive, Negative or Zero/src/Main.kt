fun main() {
    val a = readln().toInt()

    println(if (a < 0) "negative" else if (a > 0) "positive" else "zero")
}