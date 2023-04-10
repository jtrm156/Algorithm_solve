package codingTestBase
import kotlin.math.sqrt

class AlgorithmBaseMath {

    fun isPrime(n: Int): Boolean {
        if (n <= 1) return false

        for (i in 2..sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) return false
        }
        return true
    }

    //root 를 사용하지 않는 판별
    fun isPrimeWithoutSqrt(n: Int): Boolean {
        var i = 2
        while (i * i <= n) {
            if (n % i++ == 0) return false
        }
        return true
    }

//fun algorithm_base.coding_test.toss.main() {
//    println(isPrime(17))
//}
}