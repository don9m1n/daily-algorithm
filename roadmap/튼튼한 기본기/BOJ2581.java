package roadmap.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소수
public class BOJ2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[n + 1];
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = 2; i * j <= n; j++) {
                prime[i * j] = true;
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for (int i = m; i <= n; i++) {
            if (!prime[i]) {
                min = Math.min(min, i);
                sum += i;
                flag = true;
            }
        }

        if (!flag) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
