package backjoon_11723

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()

    for(i in 0 until N){
        val tmp = br.readLine().split(" ")
        val sb = StringBuilder()
        var s = 0

        when (tmp[0]) {
            "add" -> {
                s = s or (1 shl tmp[1].toInt())
            }
            "remove" -> {
                s = s and (1 shl tmp[1].toInt())
            }
            "check" -> {
                if ((s or (1 shl tmp[1].toInt())) > 0) {
                    sb.append("1\n")
                } else {
                   sb.append("0\n")
                }
            }
            "toggle" -> {
                s = s xor (1 shl tmp[1].toInt())
            }
            "all" -> {
                s.inv()
            }
            "empty" -> {
                s = 0
            }
        }
        print(s)
    }
}