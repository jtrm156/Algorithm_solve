package codingTestBase

class AlgorithmBaseSearch {
    /* 이진탐색 */
    fun binarySearch(arr: IntArray, target: Int): Int {
        var low = 0
        var high = arr.lastIndex
        var mid = 0;

        while (low <= high) {
            mid = (low + high) / 2

            when {
                arr[mid] == target -> return mid
                arr[mid] > target -> high = mid - 1
                else -> low = mid + 1
            }
        }
        return -1
    }

    /* dfs 깊이 우선 탐색 */
    fun dfsWithCall(graph: Array<MutableList<Int>>, depthList: ArrayList<Int>, check: BooleanArray, depth: Int, v: Int) {
        for (node in graph[v]) {
            if (!check[node-1]) {
                check[node-1] = true
                depthList.add(depth)
                dfsWithCall(graph, depthList, check, depth+1, node)
                check[node-1] = false
            }
        }
    }

    /* bfs 너비 우선 탐색 */
    fun bfsWithRepeat(graph: Array<MutableList<Int>>, n: Int, v: Int) : String {
        //node starting vertex, graph는 간선을 기준으로 연결된 애들을 갖고있는다.
        graph.forEach {
            it.sort()
        }
        var result = "$v"
        val queue = mutableListOf<Int>()
        val check = Array(n + 1) { false }
        queue.add(v)
        check[v] = true

        while(queue.isNotEmpty()) {
            val current = queue.removeFirst()
            graph[current].forEach {
                if (!check[it]) {
                    queue.add(it)
                    result += " $it"
                    check[it] = true
                }
            }

        }

        return result
    }

    //graph 에는 각 node 가 Index 형태로 표현됨 (0 노드는 0 번째 arr 에 연결된 node 정보를 mutablelist 로 가짐)
    //전체 개수 n
    //시작하는 vertex v
    fun dfsWithRepeat(graph: Array<MutableList<Int>>, n: Int, v: Int) : String {
        graph.forEach {
            it.sortDescending()
        }
        var result = "$v"
        val stack = mutableListOf<Int>() //sequence
        val check = Array(n + 1) { false }
        stack.add(v)
        check[v] = true

        while(stack.isNotEmpty()) {
            val current = stack.removeLast()
            if (!check[current] && current != v) {
                result += " $current"
                check[current] = true
            }
            graph[current].forEach {
                if (!check[it]) {
                    stack.add(it)
                }
            }
        }

        return result
    }
}