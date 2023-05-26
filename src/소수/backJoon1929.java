package 소수;

import java.util.Scanner;

public class backJoon1929 {
    public static void main(String[] args) {
        //입력 3 16
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m+1];

        for (int i=1; i <=m; i++) {
            a[i] = i;
        }

        // 에라토스테네스의 체, 2부터 m의 제곱근까지 여기선 4까지
        // m이 a*b라고 가정했을 때, a와 b 모두 m의 제곱근보다 클 수 없습니다.
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (a[i] == 0) continue;

            for (int j = i+i; j <=m; j = j+i) {
                a[j] = 0;
            }
        }

        for (int i = n; i <=m; i++) {
            if (a[i] != 0) {
                System.out.println(a[i]);
            }
        }
    }
}
