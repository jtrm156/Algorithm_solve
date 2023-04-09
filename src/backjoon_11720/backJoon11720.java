package backjoon_11720;

import java.util.Scanner;

/** 문제에 주어진 방향을 먼저 확인해보고 구현 하자.
 *  로직부터 구현하면 잘못된 방향으로 갈 확률이 높다.
 *  O(100)일떄를 가정해보자.N이 100이면 int나 long으로 불가능하다.
 */
public class backJoon11720 {
    public static void main(String[] args) {
        // 1. /와 %연산으로 각 자리수를 더한다. => O(100)일떄 힘들다.
        // 2. String으로 받고, toCharArray로 변환하자.
        // 3. 문자열을 숫자형으로 바꿔주자.
        // 4. 아스키코드에서 같은 의미의 문자와 숫자의 코드 값 차이는 48이다.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sNum = sc.next(); // String일때
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
            //sum += cNum[i] - 48;
        }

        System.out.print(sum);
    }
}
