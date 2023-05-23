package baekjoon.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 동전1
public class BOJ2293 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dp = new int[k + 1];
        int[] coins = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
            for (int j = coins[i]; j <= k; j++) {
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }
        System.out.println(dp[k]);
    }
}
