package backjoon_9093

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
fun main(){
    val br = System.`in`.bufferedReader()
    var n = br.readLine().toInt()
    while(n-->0){
        var sp = br.readLine().split(" ")
        for(a in sp){
            print(a.reversed()+' ')
        }
        println()
    }
}