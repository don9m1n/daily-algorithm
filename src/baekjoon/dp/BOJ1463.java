package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1로 만들기
public class BOJ1463 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result = makeOne(N);
        System.out.println("result = " + result);
    }

    static int makeOne(int n) {

        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;

            if(i % 6 == 0) {
                dp[i] = Math.min(dp[i], Math.min(dp[i / 2], dp[i / 3])) + 1;
            }
            if(i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if(i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            System.out.println(Arrays.toString(dp));
        }

        return dp[n];
    }
}
