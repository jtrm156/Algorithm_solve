package backjoon_15650

import java.util.*

var n = 0
var m = 0
val arr = IntArray(10)
val isUsed = BooleanArray(10, { false })

fun dfs(k : Int, start : Int) {
    if (k == m) {
        for (i in 0 until m) {
            print("${arr[i]} ")
        }
        println()
        return
    }

    for (i in start .. n) {
        if (!isUsed[i]) {
            arr[k] = i
            isUsed[i] = true
            dfs(k+1, i+1)
            isUsed[i] = false
        }
    }
}

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val token = StringTokenizer(br.readLine(), " ")
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    dfs(0,1)

    bw.flush()
}