package backjoon_10828

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine().toInt()
    val stack = arrayListOf<Int>()

    for(i in 0 until N){
        val tmp = br.readLine().split(" ")

        when (tmp[0]) {
            "push" -> {
                stack.add(tmp[1].toInt())
            }
            "pop" -> {
                if (stack.isNotEmpty()) {
                    println(stack.removeAt(stack.size -1))
                } else {
                    println("-1")
                }
            }
            "size" -> {
                println(stack.size)
            }
            "empty" -> {
                if (stack.isEmpty()) {
                    println("1")
                } else {
                    println("0")
                }
            }
            "top" -> {
                if (stack.isNotEmpty()) {
                    println(stack[stack.size -1])
                } else {
                    println("-1")
                }
            }
        }
    }
}