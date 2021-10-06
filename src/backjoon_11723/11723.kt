package backjoon_11723

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val stack = arrayListOf<Int>()

    for(i in 0 until N){
        val tmp = br.readLine().split(" ")
        var s = 0

        when (tmp[0]) {
            "add" -> {
                s = s or (1 shl tmp[1].toInt())
            }
            "remove" -> {
                s = s and (1 shl tmp[1].toInt())
            }
            "check" -> {
                s =
            }
            "toggle" -> {
                s = s xor (1 << tmp[1].toInt())
            }
            "all" -> {
                s = (1 shl 21) -1
            }
            "empty" -> {
                s = 0
            }
        }
    }
}