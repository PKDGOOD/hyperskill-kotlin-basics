fun main() {
    var h1 = readln().toInt()
    var h2 = readln().toInt()
    var h3 = readln().toInt()

    println((h1<=h2 && h2<=h3) || (h1>=h2 && h2>=h3))
}