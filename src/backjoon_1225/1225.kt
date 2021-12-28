package backjoon_1225

fun main() = with(System.`in`.bufferedReader()) {
    val (A, B) = readLine().split(" ")
    print(A.fold(0L) { total, num -> total + B.sumOf { num.digitToInt() * it.digitToInt() } })
}