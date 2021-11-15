package backjoon_15663
/*
import java.util.*

var n = 0
var m = 0
val arr = IntArray(10)
val isUsed = BooleanArray(10, { false })
val arr2 = mutableListOf<Int>()
val br = System.`in`.bufferedReader()
val bw = System.`out`.bufferedWriter()
var arr2_distinct = mutableListOf<Int>()

fun dfs(k : Int) {
    if (k == m) {
        for (i in 0 until m) {
            //print("${arr[i]} ")
            bw.write("${arr[i]} ")
        }
        //println()
        bw.write("\n")
        return
    }

    for (i in 0 until arr2.size) {
        if (!isUsed[i]) {
            arr[k] = arr2[i]
            isUsed[i] = true
            dfs(k+1)
            isUsed[i] = false
        }
    }
}

fun main() {
    val token = StringTokenizer(br.readLine(), " ")
    n = token.nextToken().toInt()
    m = token.nextToken().toInt()

    br.readLine().split(" ").map{ arr2.add(it.toInt()) }
    arr2.sort()

    dfs(0)

    bw.flush()
    bw.close()
}
*/
import kotlin.collections.HashSet
val bw = System.`out`.bufferedWriter()
val st = HashSet<String>()
var N=0;
var M=0
lateinit var arr : List<Int>
lateinit var used : BooleanArray
fun sol(str:String){
    if(str.filter { it=='#' }.length  == M) {
        var ret = str.replace('#', ' ')
        if(!st.contains(ret)) {
            st.add(ret)
            bw.write(ret+'\n')
        }
        return;
    }
    for(i in 0 until N){
        if(!used[i]){
            used[i]=true
            sol(str+arr[i].toString()+"#")
            used[i]=false;
        }
    }
}
fun main() = with(System.`in`.bufferedReader()){
    var ip = readLine().split(' ').map{it.toInt()}
    N=ip[0]; M=ip[1]
    arr = readLine().split(' ').map { it.toInt() }
    used = BooleanArray(N)
    arr = arr.sorted()
    sol("")
    bw.close()
}