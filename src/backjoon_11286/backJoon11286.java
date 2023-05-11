package backjoon_11286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class backJoon11286 {
    /*
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if(abs1 == abs2) return o1 > o2 ? 1 : -1;
                return abs1 - abs2;
        });

        for(int i = 0 ; i < n; i++){
            int val = Integer.parseInt(br.readLine());

            if(val == 0){
                if(queue.isEmpty()) System.out.println("0");
                else System.out.println(queue.poll());
            } else{
                queue.add(val);
            }
        }
    }
    */

    //문제파악이 중요한 문제
    //절대값과 관련된 정렬이 필요, 우선순위 큐로 문제해결인데 절대값 정렬이므로 우선순위 큐의 정렬기준을 정의
    //절대값이 똑같을땐 음수를 먼저 출력
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1; // 절댓값이 가튼 경우 음수 우선
            }

            return first_abs - second_abs; // 절댓값 작은 데이터 우선(절대값이 클때는 second_abs - first_abs)
        });

        for (int i = 0; i < n; i++) {
            int request = Integer.parseInt(br.readLine());
            if(request == 0) {
                if(queue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(queue.poll());
                }
            } else {
                queue.add(request);
            }
        }
    }
}
