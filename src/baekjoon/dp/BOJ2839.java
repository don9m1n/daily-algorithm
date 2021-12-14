package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 설탕 배달 (다시 풀어봄)
public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] sugars = {3, 5};
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int sugar : sugars) {
                if (sugar <= i) {
                    dp[i] = Math.min(dp[i], dp[i - sugar] + 1);
                }
            }
        }

        int result = (dp[n] == n + 1) ? -1 : dp[n];
        System.out.println(result);

    }
}
