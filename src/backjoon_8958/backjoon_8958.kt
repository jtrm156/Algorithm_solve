import java.io.*
import java.util.*

fun main(){
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()

    val Num = br.readLine().toInt()

    repeat(Num) {
        val ox = br.readLine()
        var result = 0
        var count = 1

        ox.forEach{
            if (it == 'O') {
                result += count
                count++
            }
            else if (it == 'X') {
                count = 1
            }
        }
        println(result)
    }
}