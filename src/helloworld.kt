import java.io.*
import java.util.*

fun main(){

        val br = System.`in`.bufferedReader()
        //val (A, B) = br.readLine()!!.split('\n').map{ it.toInt()}

        val A = br.readLine().toInt()

        for (i in 1..A){
                val (B, C) = br.readLine()!!.split(' ').map{ it.toInt()}
                println(B+C)
        }
}

