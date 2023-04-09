package backjoon_1546;

import java.util.Scanner;

public class backJoon1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        /* 풀어서 배열에 넣는다
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > max) max = array[i];
            sum = sum + array[i];
        }
        */

        /* 배열 없이 바로 */
        long sum = 0;
        long max = 0;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp > max) max = temp;
            sum = sum + temp;
        }
        System.out.println(sum * 100.0 / max / n);
    }
}
