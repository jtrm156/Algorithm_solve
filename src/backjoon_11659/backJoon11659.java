package backjoon_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class backJoon11659 {
    public static void main(String[] args) throws IOException {
        //데이터가 많이 들어올대는 scanner보단 bufferedReader가 좋다.
        //왜냐면 속도가 더 빠르기떄문
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //int m = sc.nextInt();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] sum = new long[suNo+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for (int i = 1; i <= suNo; i++) {
            sum[i] = sum[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(sum[j] - sum[i-1]);
        }
    }
}
