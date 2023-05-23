package backjoon_11724_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class backJoon11724 {
    static boolean[] visited;
    static ArrayList<Integer>[] a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];
        a = new ArrayList[n+1];

        for (int i = 1; i<n+1; i++) {
            a[i] = new ArrayList<Integer>(); //인접리스트의 각 arrayList 초기화하기
        }

        for(int i = 0; i <m; i++) {
            //엣지정보를 인접리스트에 담는 과정
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            //양쪽방향으로 다 add
            a[s].add(e);
            a[e].add(s);
        }

        int count = 0;

        for (int i = 1; i < n+1; i++) {
            if(!visited[i]) {
                count++;
                DFS(i);
            }
        }

        System.out.println(count);
    }

    private static void DFS(int v) {
        if(visited[v]) {
            return;
        } else {
            visited[v] = true;

            for (int i : a[v]) {
                if (!visited[i]) {
                    DFS(i); //재귀함수
                }
            }
        }
    }
}

/*
*
*
*
* static int[][] check; // 간선 연결 상태
  static boolean[] checked; // 확인 여부
  static int n; // 정점 개수
  static int m; // 간선 개수


	// 시작점을 변수로 받아 출발, 출력 후 다음 연결점을 찾아 시작점을 변경하여 재호출
	public static void dfs(int i) {
			checked[i] = true;
			for(int j = 1; j <= n; j++) {
				if(check[i][j] == 1 && !checked[j]) {
					dfs(j);
				}
			}
		}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 정점 개수
		m = sc.nextInt(); // 간선 개수

		check = new int[1001][1001]; // 좌표를 그대로 받아들이기 위해 +1해서 선언
		checked = new boolean[1001]; // 초기값 False

		// 간선 연결상태 저장
		for(int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();

			check[u][v] = check[v][u] = 1;
		}

		int count = 0; // 결과값

		for(int k=1; k <= n; k++) {	// 0이라는 점이 없으므로 k는 1에서 출발, k는 n보다 작거나 같아야 함!
			if(!checked[k]) {
				dfs(k);
				count++;
			}
		}

		System.out.print(count);
	}*/
