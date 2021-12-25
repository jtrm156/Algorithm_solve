package backjoon_1373

import java.util.*

fun main(){
    val br = System.`in`.bufferedReader()
    var a = br.readLine()
    var sum = 0

    if (a.length % 3 == 1) a = "00$a"
    if (a.length % 3 == 2) a = "0$a"
    // 3개씩으로 안나눠 떨어질 경우 앞에 0을 채워줌

    for(i in a.indices step 3){
        sum = a[i].toString().toInt() * 4 + a[i+1].toString().toInt() * 2 + a[i+2].toString().toInt()
        // 3자리씩 끊어서 8진수로 변환
        print(sum)
    } // indices == 0 until a.length

}