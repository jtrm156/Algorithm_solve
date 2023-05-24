package 이진탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class backJoon1920 {
    /*
    public static int[] arr;

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());
            arr = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // 배열은 반드시 정렬되어있어야한다.
            Arrays.sort(arr);

            int M = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(), " ");

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {

                // 찾고자 하는 값이 있을 경우 1, 없을 경우 0을 출력해야한다.
                if (binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
                    sb.append(1).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            }
            System.out.println(sb);
        }
        /*
         * @param key 찾으려는 값
         * @return key와 일치하는 배열의 인덱스
         *
        /*
        public static int binarySearch(int key) {

            int lo = 0;                    // 탐색 범위의 왼쪽 끝 인덱스
            int hi = arr.length - 1;    // 탐색 범위의 오른쪽 끝 인덱스

            // lo가 hi보다 커지기 전까지 반복한다.
            while (lo <= hi) {

                int mid = (lo + hi) / 2;    // 중간위치를 구한다.

                // key값이 중간 위치의 값보다 작을 경우
                if (key < arr[mid]) {
                    hi = mid - 1;
                }
                // key값이 중간 위치의 값보다 클 경우
                else if (key > arr[mid]) {
                    lo = mid + 1;
                }
                // key값과 중간 위치의 값이 같을 경우
                else {
                    return mid;
                }
            }

            // 찾고자 하는 값이 존재하지 않을 경우
            return -1;
        }
        */

        //05.24
        public static void main(String[] args) throws IOException {
            //O(nlogn)

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(a);

            int m = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());

            for (int i =0; i < m; i++) {
                boolean find = false;
                int target = Integer.parseInt(st.nextToken());
                int start = 0;
                int end = a.length -1;

                while(start <= end) {
                    int midIndex = (start+end) / 2;
                    int midValue = a[midIndex];

                    if (midValue > target) {
                        //왼족 그룹으로 이동
                        end = midIndex -1;
                    } else if (midValue < target) {
                        //오른쪽 그룹으로 이동
                        start = midIndex +1;
                    } else {
                        //찾은 경우
                        find = true;
                        break;
                    }
                }

                if (find) sb.append(1);
                else sb.append(0);
            }

            System.out.println(sb);
        }
}

