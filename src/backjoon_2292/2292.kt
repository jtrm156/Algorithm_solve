package backjoon_2292

// kotlin(native)
// 시간초과
fun main() {
    val br = System.`in`.bufferedReader()
    var str = br.readLine().toString()
    var A = str.split(" ").get(0).toLong()// 1000
    var B = str.split(" ").get(1).toLong() // 70
    var C = str.split(" ").get(2).toLong() // 170

    // B가 C랑 같거나 클경우, 절대 손익분기점 못넘음
    if(B >= C) {
        println("-1")
    }

    var minus:Long = A // 손해가 나는 금액
    var plus:Long = 0 // 이득이 나는 금액
    var n = 1 // 손익분기점에 도달할 횟수

    while(true) {
        minus += B
        plus += C

        if(plus > minus) {
            println(n)
            break;
        }
        else {
            n++;
        }
    }

}