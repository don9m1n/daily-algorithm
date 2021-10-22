package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 설탕 배달
public class BOJ_2839 {
    public static void main(String[] args) throws IOException {
        int result = sugarDelivery();
        System.out.println("result = " + result);
    }


    private static int sugarDelivery() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] sugars = {3, 5};

        int[] dp = new int[N + 1];
        Arrays.fill(dp, N + 1);
        dp[0] = 0;

        for(int i = 1; i <= N; i++) {
            for (int sugar : sugars) {
                if(sugar <= i) {
                    dp[i] = Math.min(dp[i], dp[i - sugar] + 1);
                }
            }
        }

        return (dp[N] == N + 1) ? -1 : dp[N];
    }
}
