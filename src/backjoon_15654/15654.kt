package backjoon_15654

import java.util.*

var n = 0
var m = 0
val arr = IntArray(10)
val isUsed = BooleanArray(10, { false })
val arr2 = mutableListOf<Int>()

fun dfs(k : Int) {
    if (k == m) {
        for (i in 0 until m) {
            print("${arr[i]} ")
        }
        println()
        return
    }

    for (i in 0 until arr2.size) {
        if (!isUsed[i]) {
            arr[k] = arr2[i]
            isUsed[i] = true
            dfs(k+1)
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

    br.readLine().split(" ").map{ arr2.add(it.toInt()) }
    arr2.sort()
    dfs(0)

    bw.flush()
    bw.close()
}