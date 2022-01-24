package baekjoon.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수2
public class BOJ2748 {

    static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new long[n + 1];
        for (int i = 0; i < n + 1; i++) {
            arr[i] = -1;
        }

        // bottomUp(n);
        System.out.println(topDown(n));
    }

    // Top-Down (재귀)
    private static long topDown(int n) {

        arr[0] = 0;
        arr[1] = 1;

        if (arr[n] == -1) {
            arr[n] = topDown(n - 1) + topDown(n - 2);
        }

        return arr[n];
    }

    // Bottom-Up (반복문)
    private static void bottomUp(int n) {
        if(n == 1) {
            System.out.println(1);
            return;
        }else if(n == 0) {
            System.out.println(0);
            return;
        }

        long[] dp = new long[n + 1]; // 메모이제이션 -> 계산결과를 저장하여 재활용
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[n]);
    }
}
