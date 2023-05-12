package hyundai_autoever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testpractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();
        String[] c = a.split("-");

        for (int i = 0; i < c.length; i++) {
            sb.append(c[i].charAt(0));
        }

        System.out.print(sb);
    }
}
