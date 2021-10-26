package backjoon_15666

import java.util.*

var n = 0
var m = 0
val arr = IntArray(10)
val isUsed = BooleanArray(10, { false })
val arr2 = mutableListOf<Int>()
val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()
var arr2_distinct = mutableListOf<Int>()

fun dfs(k : Int, start : Int) {
    if (k == m) {
        for (i in 0 until m) {
            //print("${arr[i]} ")
            bw.write("${arr[i]} ")
        }
        //println()
        bw.write("\n")
        return
    }

    for (i in start until arr2_distinct.size) {
        arr[k] = arr2_distinct[i]
        dfs(k+1,start+1)
    }
}

fun main() {
    val token = StringTokenizer(br.readLine(), " ")
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    br.readLine().split(" ").map{ arr2.add(it.toInt()) }
    arr2.sort()

    for(i in 0 until arr2.distinct().size){
        arr2_distinct.add(arr2.distinct()[i])
    }

    dfs(0,0)

    bw.flush()
    bw.close()
}