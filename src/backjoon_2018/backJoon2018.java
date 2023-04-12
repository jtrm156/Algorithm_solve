package backjoon_2018;

import java.util.Scanner;

public class backJoon2018 {
    public static void main(String[] args) {
        //투 포인터 시작인덱스와 종료인덱스를 투 포인터로 지정한 후 문제에 접근
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while (end_index != N) {
            if (sum == N) {
                count++;
                end_index++;
                sum = sum+end_index;
            } else if (sum > N) {
                sum = sum - start_index;
                start_index++;
            } else if (sum < N) {
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
