package backjoon_1157

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = System.`in`.bufferedReader()
    val str = br.readLine()
    val map = mutableMapOf<Char, Int>()

    str.forEach {
        val char = it.toLowerCase()

        if (map.containsKey(char)) {
            map[char] = map[char]!!.plus(1)
        }
        else {
            map.set(char, 1)
        }
    }

    val max = map.maxByOrNull { it.value }

    if (map.filter { it.value == max!!.value }.count() > 1) {
        println("?")
    }
    else {
        println(max!!.key.toUpperCase())
    }
}