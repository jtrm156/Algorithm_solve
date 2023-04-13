package codingTestBase

class AlgorithmBaseSort {
    fun custom_sort() {
        var aar = arrayListOf<Pair<Int, Int>>()
        //...
        aar.sortWith(Comparator { o1, o2 ->
            if (o1.second == o2.second) { //second 끼리 같으면 first 를 비교하고
                o1.first.compareTo(o2.first)
            } else {
                o1.second.compareTo(o2.second) //다르면 second 를 비교한다.
            }
        })
    }
}