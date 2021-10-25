package backjoon_15663

import java.util.*

var n = 0
var m = 0
val arr = IntArray(10)
val isUsed = BooleanArray(10, { false })
val arr2 = mutableListOf<Int>()
val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()
var arr2_distinct = mutableListOf<Int>()

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
        if (!isUsed[i]) {
            arr[k] = arr2[i]
            isUsed[i] = true
            dfs(k+1)
            isUsed[i] = false
        }
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