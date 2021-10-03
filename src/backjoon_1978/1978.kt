package backjoon_1978

import java.lang.Math.sqrt

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val list = mutableListOf<Int>()
    var flag = true
    var count = 0

    br.readLine().split(" ").map{ list.add(it.toInt())}

    list.forEach{
        if(prime(it)) count++
    }

    print(count)
}

fun prime(A: Int): Boolean {
    var flag = true

    if ( A == 1) flag = false
    else {
        for (i in sqrt(A.toDouble()).toInt() downTo 2) {
            if(A % i == 0)
                flag = false
        }
    }
    return flag
}