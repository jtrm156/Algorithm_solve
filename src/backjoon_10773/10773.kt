package backjoon_10773

import java.io.*
import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val n = br.readLine().toInt()
    val stack = Stack<Int>()

    for(i in 0 until n) {
        val cmd = br.readLine().toInt()
        if(cmd==0) stack.pop()
        else stack.push(cmd)
    }

    var sum = 0

    while(!stack.empty())
        sum += stack.pop()

    bw.write("$sum")
    bw.flush()
    bw.close()
}