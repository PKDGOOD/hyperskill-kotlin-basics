fun main() {

    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println((b<=a && a<=c) || (c<=a && a<=b))
}