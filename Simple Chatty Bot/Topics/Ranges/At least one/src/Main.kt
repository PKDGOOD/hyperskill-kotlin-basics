fun main() {
    val r1 = readln().toInt()..readln().toInt()
    val r2 = readln().toInt()..readln().toInt()
    val n = readln().toInt()

    println(n in r1 || n in r2)
}