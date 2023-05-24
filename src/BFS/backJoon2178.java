package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class backJoon2178 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited;
    static int[][] a;
    static int n,m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n][m]; // 문제에서 주어진 1과0으로 된 map
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken(); // 1011010101

            for (int j = 0; j < m ; j++) {
                a[i][j] = Integer.parseInt(line.substring(j,j+1)); //1 0 1 1 0 1 ...으로 배열에 넣어줌.
            }
        }

        //Bfs시작
        BFS(0,0);

        System.out.println(a[n-1][m-1]);
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        visited[i][j] = true;

        while(!queue.isEmpty()) {
            //bfs가 탐색할 수 없을때까지
            int[] now = queue.poll(); // 데이터를 뽑음

            for (int k = 0; k < 4; k++) {
               //상하좌우 탐색
               int x = now[0] + dx[k];
               int y = now[1] + dy[k];

               if (x >= 0 && y >= 0 && x < n && y <m) {
                   // 배열을 넘어가면 안되는 부분
                   if(a[x][y] !=0 && !visited[x][y]) {
                       //0이 아니고 방문한 배열이면 안됨
                       //이제 갈 수 있는 곳이다.
                       visited[x][y] = true;
                       a[x][y] = a[now[0]][now[1]] + 1;
                       queue.add(new int[] {x,y});
                   }
               }
            }
        }
    }
}
