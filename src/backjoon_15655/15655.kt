package backjoon_15655

fun main() {
    val br = System.`in`.bufferedReader()

    val (N, M) = br.readLine().split(" ").map{ it.toInt() }

    val list = mutableListOf<Int>()

    br.readLine().split(" ").map{ list.add(it.toInt())}

    list.sort()

    print(list)
}