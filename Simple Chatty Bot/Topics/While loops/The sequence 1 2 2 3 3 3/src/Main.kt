fun main() {
    val num = readln().toInt()
    var i = 1
    var count = 0
    while(i <= num) {
        repeat(i) {
            if(count < num) {
                print("$i ")
                count++
            }
        }
        i++
    }
}