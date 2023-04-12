package backjoon_1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class backJoon1940 {
    public static void main(String[] args) throws IOException {
        //투포인터로 접근 n,정렬 nlogn
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int count = 0;
        int i = 0; //A[0] -> Min
        int j = n-1; //A[n-1] -> Max

        while(i < j) {
            if (A[i] + A[j] < m) i++;
            else if(A[i] + A[j] > m) j--;
            else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
