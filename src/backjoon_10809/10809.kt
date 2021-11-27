package backjoon_10809

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    val alphabet = IntArray(26){-1}
    val str = br.readLine()

    for (i in str.indices)
        if (alphabet[str[i].toInt() - 97] == -1)
            alphabet[str[i].toInt() - 97] = i

    alphabet.forEach { print("${it} ") }
}