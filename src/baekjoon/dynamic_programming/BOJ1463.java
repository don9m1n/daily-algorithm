package baekjoon.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

// 1로 만들기
public class BOJ1463 {

    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        System.out.println(topDown(n));
        System.out.println(bottomUp(n));
    }

    // Bottom-Up (반복문)
    private static int bottomUp(int n) {

        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            if(i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        return dp[n];
    }

    // Top-Down (재귀)
    private static int topDown(int n) {

        if (dp[n] == null) {
            if (n % 6 == 0) { // 2와 3으로 나눠지는 경우
                dp[n] = Math.min(topDown(n - 1), Math.min(topDown(n / 2), topDown(n / 3))) + 1;
            } else if (n % 3 == 0) { // 3으로만 나눠지는 경우
                dp[n] = Math.min(topDown(n / 3), topDown(n - 1)) + 1;
            } else if (n % 2 == 0) { // 2로만 나눠지는 경우
                dp[n] = Math.min(topDown(n / 2), topDown(n - 1)) + 1;
            } else { // 2와 3으로 나눠지지 않는 경우
                dp[n] = topDown(n - 1) + 1;
            }
        }
        return dp[n];
    }
}
