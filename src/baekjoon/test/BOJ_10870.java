package baekjoon.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 5
public class BOJ_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(N));
    }

    static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
