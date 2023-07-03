package roadmap.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이진수
public class BOJ3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            while (n > 0) {
                sb.append(n % 2);
                n /= 2;
            }

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == '1') {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
