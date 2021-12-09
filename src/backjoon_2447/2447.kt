package backjoon_2447

val br = System.`in`.bufferedReader()
val bw = System.out.bufferedWriter()

fun main() {
    val N : Int = br.readLine().toInt()
    for(y in 0 until N){
        for(x in 0 until N)
            Star(x,y,N)
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}

fun Star(x : Int, y : Int, N : Int) {
    if((x / N) % 3 == 1 && (y / N)%3 == 1)
        bw.write(" ")
    else if(N/3==0)
        bw.write("*")
    else
        Star(x,y,N/3)
}