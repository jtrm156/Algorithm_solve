package codingTestBase

import java.util.*

class AlgorithmBaseStackQueue {
    fun queueWithLibrary() {
        var q: Queue<Int> = LinkedList()
        q.add(1) // 큐가 가득찬 상태이면 exception 발생
        q.offer(1) // 큐가 가득찬 상태이면 false 반환

        q.remove() // 삭제하면서 객체 반환 비어있는 상태이면 exception 발생
        q.poll() // 삭제하면서 객체 반환 비어있는 상태이면 false 반환
    }

    fun queueWithArrayList() {
        var q = arrayListOf<Int>()
        q.add(1) //뒤로 넣고
        q.removeFirst() //앞에서 뺀다
    }

    //stack 은 first in first out 이다.
    fun stackWithLibrary() {
        var s = Stack<Int>()
        s.push(1) //큐에 추가
        s.peek() //빼지 않고 제일 위의 것 확인하기
        s.pop() //큐에서 빼기
    }

    fun stackWithArrayList() {
        var s = arrayListOf<Int>()
        s.add(1) //뒤로 넣고
        s.removeLast() //뒤에서 뺀다
        s.get(s.size-1) // peek
    }

    //이진 트리 형태의 자료 구조로, 오름차순/내림차순으로 값을 저장한다. 값에서 peek 를 사용해 최대값/최소값을 얻을 수 있다.
    fun priorityQueue() {
        val pqAscending = PriorityQueue<Int>()
        val pqDescending = PriorityQueue<Int>(Collections.reverseOrder())
        val pqCustomOrder = PriorityQueue<Pair<Int, String>>(kotlin.Comparator { o1, o2 ->
            when {
                o1.first != o2.first -> when {
                    o1.first < o2.first -> 1    //1 -> o2를 높은 우선순위로 둔다
                    o1.first > o2.first -> -1   //-1 -> o1을 높은 우선 순위로 둔다
                    else -> 0                   //0 -> 같은 우선 순위로 둔다
                }
                else -> when {
                    o1.second < o2.second -> 1
                    o1.second > o2.second -> -1
                    else -> 0
                }
            }
        })
        pqAscending.addAll(listOf(1, 3, 5, 6, 6))
        pqDescending.addAll(listOf(1, 3, 5, 6, 6))

        pqAscending.add(4)
        pqDescending.offer(4)

        pqAscending.contains(5) // 확인

        pqAscending.peek() // 1
        pqDescending.peek() // 6

        pqAscending.poll()
        pqDescending.remove()
    }
}