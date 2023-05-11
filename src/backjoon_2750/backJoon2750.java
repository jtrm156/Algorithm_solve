package backjoon_2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backJoon2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        //버블 정렬을 구현하는 영역

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                //loop가 한번 돌수록 마지막에는 정렬된 부분이 생겨서 마지막은 빼준다
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
