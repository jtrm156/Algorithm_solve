package backjoon_2343

lateinit var myArr: List<Int>

fun main() {
    val br = System.`in`.bufferedReader()
    var (A,B) = br.readLine().split(" ").map{ it.toInt()}
    myArr = br.readLine().split(" ").map{ it.toInt() }
    var sum = 0
    var start = 0
    var end = 0

    for (i in myArr){
        sum += i
    }

    for (i in 0 until A) {
        if(start < myArr[i]){
            start = myArr[i]
        }
        end+=myArr[i]
    }

    while(start <= end) {
        var mid = (start+end)/2
        if() {
            answer = mid
        }
    }
}