package 소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class backJoon1929 {
    /*
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

        for (int i = n; i <= m; i++) {
            if (a[i] != 0) {
                System.out.println(i);
            }
        }
    }
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        primeNumber(m, n);
    }

    //에라토스테네스의 체 이용
    static void primeNumber(int m, int n) {
        int[] arr = new int[n+1];
        StringBuilder sb = new StringBuilder();

        //배열 초기화
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        //2부터 시작해서 i의 배수들을 배열에서 지워준다
        for (int i = 2; i <= n; i++) {
            //이미 지워진 수는 건너뛴다
            if (arr[i] == 0) continue;
            for (int j = i+i; j <= n; j += i) {
                arr[j] = 0;
            }
        }
        for (int i = m; i <= n; i++) {
            if (arr[i] != 0) sb.append(i + "\n");
        }
        System.out.print(sb);
    }
}

