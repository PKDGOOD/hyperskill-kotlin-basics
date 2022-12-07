fun main() {
    val range = readln().toInt() until readln().toInt()
    var result: Long = 1

    for(x in range) {
        result *= x
    }
    println(result)
}