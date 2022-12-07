fun main() {
    var (d, c, b, a) = arrayOf(0, 0, 0, 0)

    repeat(readln().toInt()) {
        val grade = readln().toInt()

        if (grade == 2) d++
        if (grade == 3) c++
        if (grade == 4) b++
        if (grade == 5) a++
    }

    println("$d $c $b $a")
}