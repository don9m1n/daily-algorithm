package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 피보나치 함수
public class BOJ1003 {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            dp = new int[n + 1];
            fibonacci(n);

            if(dp.length == 1) {
                System.out.println(1 + " " + dp[n]);
            }else {
                System.out.println(dp[n - 1] + " " + dp[n]);
            }
        }
    }

    private static int fibonacci(int n) {

        if(n <= 1) {
            dp[n] = n;
            return n;
        } else if(dp[n] != 0) {
            return dp[n];
        } else {
            return dp[n] = fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
