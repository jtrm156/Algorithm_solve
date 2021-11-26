package backjoon_11720

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    var N = br.readLine().toInt()
    var str = br.readLine().toString()
    var result = 0

    for (i in str) {
        result += i.digitToInt()
    }

    print(result)
}