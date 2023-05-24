package Greedy;

import java.util.Scanner;

public class backJoon11047 {
    public static void main(String[] args) {
        //이 문제에선 최대한 큰 금액의 동전으로 구성하면 최소로 사용한다.
        //그리드 알고리즘은 항상 최선의 해를 보장하진 않는다.
        //잘따져보지 않으면 반례가 생긴다.
        //괄호 속의 조건을 따지는게 젤 중요하다.
        //이문제에선 배수가 된다는 조건을 부여해서 그리드 알고리즘으로 풀 수 있도록 했다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;

        for (int i = n-1; i >= 0; i--) {
            if (a[i] <= k) {
                count += (k/a[i]);
                k = k % a[i];
            }
        }

        System.out.println(count);
    }
}
