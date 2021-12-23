package backjoon_2566

import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val array = Array(9) { IntArray(9) }

    var max = 0
    var row =0
    var colum = 0

    for (i in array.indices) {
        for (j in 0 until array[i].size) {
            array[i][j] = sc.nextInt()
            if (array[i][j]>max){
                max = array[i][j]
                row =i
                colum = j
            }
        }
    }

    println(max)
    println("${row+1} ${colum+1}")
}