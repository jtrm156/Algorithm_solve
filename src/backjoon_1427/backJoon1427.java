package backjoon_1427;

import java.util.Scanner;

public class backJoon1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] a = new int[str.length()];

        for(int i = 0; i <str.length(); i++) {
            a[i] = Integer.parseInt(str.substring(i, i+1));
        }

        //선택정렬
        for (int i = 0; i < str.length(); i++) {
            int Max = i;

            for (int j = i+1; j<str.length(); j++) {
                if(a[j] > a[Max]) {
                    Max = j;
                }
            }

            if (a[i] < a[Max]) {
                int temp = a[i];
                a[i] = a[Max];
                a[Max] = temp;
            }
        }

        for(int i = 0; i <str.length(); i++) {
            System.out.print(a[i]);
        }
    }
}
