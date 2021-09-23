import java.io.*
import java.util.*

fun main(){
        /* 2557번
        print("Hello World!")
        */

        /* 10718번
        println("강한친구 대한육군")
        print("강한친구 대한육군")
        */

        /* 10171번
        println(
                """\    /\
                 )  ( ')
                (  /  )
                 \(__)|""")
        */

        /* 10172번
        println(
                """|\_/|
                |q p|   /}
                ( 0 )${"\"\"\""}\
                |"^"`    |
                ||_/=\\__|
                """)
        */

        /* 1000번
        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toInt()}

        print(A+B)
        */

        /* 1001번

        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toInt()}

        print(A-B)
        */

        /* 10998번

        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toInt()}

        print(A*B)
        */

        /* 1008번

        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toDouble()}

        print(A/B)
        */

        /* 10869번
        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toInt()}

        println(A+B)
        println(A-B)
        println(A*B)
        println(A/B)
        println(A%B)
        */

        /* 10430번
        val br = System.`in`.bufferedReader()
        val (A, B, C) = br.readLine().split(' ').map{ it.toInt()}

        println((A+B)%C)
        println(((A%C) + (B%C))%C)
        println((A*B)%C)
        print(((A%C)*(B%C))%C)
        */

        /* 2588번
        val br = System.`in`.bufferedReader()
        val A = br.readLine().toInt()
        val B = br.readLine().toInt()

        println(A*(B%10))
        println(A*((B%100)/10))
        println(A*(B/100))
        println(A*B)
        */

        /* 1330번
        val br = System.`in`.bufferedReader()
        val (A, B) = br.readLine().split(' ').map{ it.toInt()}

        if(A>B){
                print(">")
        }
        else if(A<B){
                print("<")
        }

        else if(A==B){
                print("==")
        }
        */

        /* 9498번
        val br = System.`in`.bufferedReader()
        val A = br.readLine().toInt()


        //if,else if 방식
        if(A >= 90 && A <= 100){
            print("A")
        }
        else if(A >= 80 && A <= 89){
            print("B")
        }
        else if(A >= 70 && A <= 79){
            print("C")
        }
        else if(A >= 60 && A <= 69){
            print("D")
        }
        else if(A <= 59){
            print("F")
        }


        //when과 range방식
        when (A) {
                in 90..100 -> { println("A") }
                in 80..89 -> { println("B") }
                in 70..79 -> { println("C") }
                in 60..69 -> { println("D") }
                else -> { println("F") }
        }
        */

        /* 2753번
        val br = System.`in`.bufferedReader()
        val A = br.readLine().toInt()

        if((A%4 == 0 && A%100 !=0) || A%400 == 0){
                print("1")
        }
        else{
                print("0")
        }
        */

        /* 14681번
        val br = System.`in`.bufferedReader()

        val A = br.readLine().toInt()
        val B = br.readLine().toInt()

        if(A >0 && B>0){
                print("1")
        }
        else if(A > 0 && B < 0){
                print("4")
        }
        else if(A < 0 && B > 0){
                print("2")
        }
        else if(A < 0 && B < 0){
                print("3")
        }
        */

        /* 2884번
        val br = System.`in`.bufferedReader()
        var (A, B) = br.readLine()!!.split(' ').map{ it.toInt()}

        if((B - 45) < 0){
                if((A-1) < 0){
                        A = 23
                        B = 60 + (B-45)
                }
                else {
                        A = A - 1
                        B = 60 + (B-45)
                }
        }
        else{
                B = B - 45
        }

        print("${A} ${B}")
        */

        /* 2739번
        val br = System.`in`.bufferedReader()
        val (A) = br.readLine().split(' ').map{ it.toInt()}

        for (i in 1..9) {
                println("${A} * ${i} = ${A*i}")
        }
        */

        /* 10950번
        val br = System.`in`.bufferedReader()
        // val (A, B) = br.readLine()!!.split('\n').map{ it.toInt()}

        val A = br.readLine().toInt()
        for (i in 1..A){
                val (B, C) = br.readLine()!!.split(' ').map{ it.toInt()}
                println(B+C)
        }
        */

}

