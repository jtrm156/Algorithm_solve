package backjoon_4673

fun main(){
    var result = 0
    var arr = BooleanArray(10036, {false})

    for (i in 0..10000) {
        var n = i.toString()
        var sum = 0

        result = i
        for (j in 0 until n.length) {
            sum += n[j].digitToInt()
            if (j == (n.length - 1)) {
                arr[result+sum] = true
            }
        }
    }

    for (i in 0..10000) {
        if(arr[i] == false) {
            println(i)
        }
    }
}