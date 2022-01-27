package baekjoon.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 설탕 배달 (다시 풀어봐라)
public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(sugarDeliveryV2(n));
    }

    // Bottom-Up1 (반복문)
    private static int sugarDeliveryV1(int n) {

        int[] dp = new int[n + 1];
        dp[3] = 1;
        for (int i = 4; i <= n; i++) {
            if(i == 4 || i == 7) {
                dp[i] = -1;
            } else if (i % 5 == 0) { // 5로 나누어지는 경우
                dp[i] = i / 5;
            } else { // 그 외의 경우 (3으로 나누어지거나 둘 다 나눠지지 않는 경우)
                dp[i] = dp[3] + dp[i - 3];
            }
        }
        return dp[n];
    }

    // Bottom-Up2 (반복문)
    private static int sugarDeliveryV1_2(int n) {

        if(n == 4 || n == 7) return -1;

        int[] dp = new int[n + 1];
        Arrays.fill(dp, 5000);
        dp[3] = 1;
        dp[5] = 1;

        for (int i = 6; i <= n; i++) {
            dp[i] = Math.min(dp[i - 5] + 1, dp[i - 3] + 1);
        }

        return dp[n] != 5000 ? dp[n] : -1;
    }

    // Greedy
    private static int sugarDeliveryV2(int n) {


        return 0;
    }
}
