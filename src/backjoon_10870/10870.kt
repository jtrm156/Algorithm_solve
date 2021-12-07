package backjoon_10870

fun main() {
    val br = System.`in`.bufferedReader()
    val input = br.readLine().toInt()
    print(fibonacci(input))
}

fun fibonacci(N: Int): Int {
    return if (N < 2) N else fibonacci(N - 1) + fibonacci(N - 2)
}