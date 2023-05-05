package backjoon_2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class backJoon2164 {
    public static void main(String[] args) throws IOException {
    /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            q.offer(i);
        }


        while(q.size() > 1) {
            q.poll();	// 맨 앞의 원소 버림
            q.offer(q.poll());	// 맨 앞의 원소를 버림과 동시에 버려진 원소를 맨 뒤에 삽입
        }

        System.out.println(q.poll());	// 마지막으로 남은 원소 출력
    }
    */

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    /**
     *  한 턴에 1개 씩 삭제되고 뒤에 1개가 추가 되므로
     *  2 * N - 1 의 공간이 필요하다.
     *  다만 index는 1부터 시작할 것이기 때문에
     *  2 * N 공간으로 생성한다.
     */
    int[] q = new int[2 * N];
        for(int i = 1; i <= N; i++) {
        q[i] = i;
    }
    int prev_index = 1;
    int last_index = N;

        while(N-- > 1) {
        prev_index++;
        q[last_index + 1] = q[prev_index];
        last_index++;
        prev_index++;
    }

        System.out.println(q[prev_index]);
}
