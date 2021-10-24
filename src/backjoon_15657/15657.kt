package backjoon_15657

import java.util.*

var n = 0
var m = 0
val arr = IntArray(10)
val isUsed = BooleanArray(10, { false })
val arr2 = mutableListOf<Int>()
val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()

fun dfs(k : Int) {
    if (k == m) {
        for (i in 0 until m) {
            //print("${arr[i]} ")
            bw.write("${arr[i]} ")
        }
        //println()
        bw.write("\n")
        return
    }

    for (i in 0 until arr2.size) {
        if(k != 0 && arr[k-1] > arr2[i]) continue
        arr[k] = arr2[i]
        dfs(k+1)
    }
}

fun main() {
    val token = StringTokenizer(br.readLine(), " ")
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    br.readLine().split(" ").map{ arr2.add(it.toInt()) }
    arr2.sort()
    dfs(0)

    bw.flush()
    bw.close()
}