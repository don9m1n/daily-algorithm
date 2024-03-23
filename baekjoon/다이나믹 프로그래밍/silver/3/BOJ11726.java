package baekjoon.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2xn 타일링
 * 피보나치 수열인 이유??
 * 맨 앞이나 끝에 | 가 오는 경우 n-1의 타일의 개수
 * 맨 앞이나 끝에 = 가 오는 경우 n-2의 타일의 개수
 * => f(n) = f(n-1) + f(n-2)
  */
public class BOJ11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(twoXn(n));
    }

    private static long twoXn(int n) {

        if(n == 1) return 1;

        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i -1] + dp[i - 2]) % 10007;
        }
        return dp[n];
    }
}
