package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 5
public class BOJ10870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result1 = fibonacciRecursion(N);
        System.out.println(result1);

        int result2 = fibonacciDP(N);
        System.out.println(result2);

    }

    static int fibonacciDP(int n) {

        if(n == 0) return 0;
        if(n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[n];
    }

    // Recursion(재귀)
    static int fibonacciRecursion(int n) {

        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
    }
}
