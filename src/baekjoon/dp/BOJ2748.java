package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수2
public class BOJ2748 {

    static long[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new long[n + 1];

        long result = fibonacci(n);
        System.out.println("result = " + result);

    }

    private static long fibonacci(int n) {
        if(n <= 1) return n;
        else if(dp[n] != 0) return dp[n];
        else return dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }
}
