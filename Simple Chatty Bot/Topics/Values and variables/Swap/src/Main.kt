fun main() {
    // Don't be afraid of the code below! 
    // In the future, you will definitely cope with it, but for now just ignore it.
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }

    // Write only exchange actions here. Do not touch the lines above
    val c = b
    b = a
    a = c


    // Do not touch the lines below
    print("$a $b")
}