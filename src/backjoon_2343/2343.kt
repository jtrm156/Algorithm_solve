package backjoon_2343

lateinit var myArr: List<Int>

fun main() {
    val br = System.`in`.bufferedReader()
    var (A,B) = br.readLine().split(" ").map{ it.toInt()}
    myArr = br.readLine().split(" ").map{ it.toInt() }
    var sum = 0

    for (i in myArr){
        sum += i
    }
}