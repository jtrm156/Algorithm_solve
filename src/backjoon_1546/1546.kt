package backjoon_1546
import java.io.*
import java.util.*

fun main(){
    val br = System.`in`.bufferedReader()

    var N = br.readLine().toDouble()
    val list = mutableListOf<Double>()
    var result = 0.0

    br.readLine().split(" ").map{ list.add(it.toDouble())}

    var max = list.maxOrNull()

    val list2 = list.map { it / max!! * 100 }

    list2.forEach(){
        result = result + it
    }
    print("${result/N}")
}