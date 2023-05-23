package hyundai_autoever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class testpractice {
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        sc.nextInt();

        visited = new boolean[1][2];

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        int[] b = new int[]{};
        int[][] d = new int[][]{};

        String a = br.readLine();
        String[] c = a.split("-");

        for (int i = 0; i < c.length; i++) {
            sb.append(c[i].charAt(0));
        }

        System.out.print(sb);

        bfs();
    }

    private static void bfs() {

    }
}
