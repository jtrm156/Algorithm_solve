package backjoon_15651

import java.util.*

var n = 0
var m = 0
val arr = IntArray(10)
val isUsed = BooleanArray(10, { false })
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

    for (i in 1 .. n) {
        arr[k] = i
        isUsed[i] = true
        dfs(k+1)
    }
}

fun main() {
    val token = StringTokenizer(br.readLine(), " ")
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    dfs(0)

    bw.flush()
    bw.close()
}