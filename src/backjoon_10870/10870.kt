package backjoon_10870

/*재귀
fun main() {
    val br = System.`in`.bufferedReader()
    val input = br.readLine().toInt()
    print(fibonacci(input))
}

fun fibonacci(N: Int): Int {
    return if (N < 2) N else fibonacci(N - 1) + fibonacci(N - 2)
}
*/

/* 배열 */
fun main() {
    val br = System.`in`.bufferedReader()
    val input: Int = br.readLine().toInt()
    val fibonacci = IntArray(input + 1)

    for (i in fibonacci.indices) {
        when (i) {
            0 -> fibonacci[0] = 0
            1 -> fibonacci[1] = 1
            else -> fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]
        }
    }
    print(fibonacci[input])
}