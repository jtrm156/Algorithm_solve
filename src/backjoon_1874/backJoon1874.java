package backjoon_1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class backJoon1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int temp = 1;
        boolean err = false;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());

            for (; temp <= m; temp++) {
                stack.push(temp);
                sb.append('+').append('\n');
            }

            if (stack.peek() == m) {
                stack.pop();
                sb.append('-').append('\n');
            } else {
                err = true;
            }
        }

        if (err) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}


