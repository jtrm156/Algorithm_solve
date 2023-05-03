package backjoon_12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backJoon12891 {
    static int myArr[];
    static int checkArr[];
    static int checkSecret;

    public static void main(String[] args) throws IOException {
        //슬라이딩 윈도우(범위) 여기선 부분문자열의 길이가 윈도우가 된다.
        //투포인터랑 다른점은 범위가 유지된다. 범위 통째로 움직임.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int result = 0;
        checkArr = new int[4]; //체크배열
        myArr = new int[4]; //현재상태
        char A[] = new char[n];
        checkSecret = 0; // 현재 네개중에 몇개가 조건을 만족하는가? (A,C,G,T 중에서)

        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());

            if (checkArr[i] == 0) {
                //0이면 없어도 된다.
                checkSecret++;
            }
        }

        for (int i=0; i < p; i++) {
            // 부분문자열 처음 받을때 세팅
            // 현재 상태의 배열에 넣어준다
            Add(A[i]);
        }

        if (checkSecret == 4) result++; //부분문자열이 가능한 경우

        //슬라이딩윈도우
        for (int i = p; i < n; i++) {
            int j = i - p;
            Add(A[i]);
            Remove(A[j]);
            if (checkSecret == 4) result++;
        }
        System.out.println(result);
        br.close();
    }

    private static void Add(char c) {
        switch(c) {
            case 'A' : {
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            }
            case 'C' : {
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            }
            case 'G' : {
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            }
            case 'T' : {
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
            }
        }
    }

    private static void Remove(char c) {
        switch(c) {
            case 'A' : {
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            }
            case 'C' : {
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            }
            case 'G' : {
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            }
            case 'T' : {
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
            }
        }
    }
}
