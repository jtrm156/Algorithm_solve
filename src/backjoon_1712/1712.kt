package backjoon_1712

fun main() = println(
    readLine()!!
        .split(" ")
        .map { it.toInt() }
        .let {
            if (it[1] >= it[2]) -1
            else {
                it[0] / (it[2] - it[1]) + 1
            }
        }
)