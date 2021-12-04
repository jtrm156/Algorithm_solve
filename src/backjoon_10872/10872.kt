package backjoon_10872
import java.util.*

fun main() {
    //val n = Scanner(System.`in`)
    val br = System.`in`.bufferedReader()
    //print(factorial(n.nextInt()))
    print(factorial(br.readLine().toInt()))
}

private fun factorial(n: Int): Int = when (n) {
    0 -> 1
    else -> n * factorial(n - 1)
}