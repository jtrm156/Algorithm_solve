package backjoon_1783

fun main() {
    val br = System.`in`.bufferedReader()
    var (N,M) = br.readLine().split(" ").map{ it.toInt() }
    var count = 0

    if (N == 1) {
        count = 1 //위아래로 한 칸도 움직일 수 없으므로 현재 나이트가 존재하는 칸 외 이동 가능한 칸이 없다.
    }

    else if (N == 2) {
        count = minOf(4, (M-1)/2 + 1) //위아래로 한 칸씩 움직일 수 있다. 따라서 가로로 2칸씩 몇 번 이동할 수 있는지 계산해보면 M에서 현재 있는 1을 제외한 후 2로 나눈 값만큼 이동이 가능하다.
        //이동 가능 횟수는 최대 3번(4번 이상 이동 시 4가지 이동 방법을 모두 사용해야 하기 때문)이므로 이동 가능 횟수는 3과 (M-1)//2 중 작은 값이 된다.
    }

    else if (M < 7) {
        count = minOf(4, M) // 세로로는 위, 아래 두 칸씩 이동이 가능하므로 최대로 이동하기 위해서는 오른쪽으로 한 칸씩만 이동한다. 오른쪽으로 한 칸씩 이동하는 경우 최대 이동 횟수는 M-1이다. 하지만 최대 이동 횟수는 3보다 큰 값을 가질 수 없다.
    }

    else
        count = (2 + (M-5)) + 1

    print(count)
}