package backjoon_2750

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.`out`.bufferedWriter()
    var list = mutableListOf<Int>()
    var N = br.readLine().toInt()

    for (i in 0 until N){
        list.add(br.readLine().toInt())
    }

    list.sort()

    for (i in 0 until N){
        println(list[i])
    }
}