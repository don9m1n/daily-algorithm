package baekjoon.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 정수 삼각형
public class BOJ1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] dp = new int[n + 1][n + 1];
        int[][] nums = new int[n + 1][n + 1];

        StringTokenizer st;
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
                if (i == n) dp[i][j] = nums[i][j];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i + 1][j] + nums[i][j], dp[i + 1][j + 1] + nums[i][j]);
            }
        }

        System.out.println(dp[1][1]);
    }
}
