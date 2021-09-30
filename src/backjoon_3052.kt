import java.io.*
import java.util.*

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val list = mutableListOf<Int>()
    var result = 0

    for (i in 0 until 10) {
        var n = br.readLine().toInt()
        list.add(n%42)
    }

    for (i in 0 until 10){
        var count = 0

        for (j in i+1 until 10){
            if (list[i] == list[j]) {
                count++
            }
        }

        if (count == 0) {
            result++
        }
    }

    print(result)
}
