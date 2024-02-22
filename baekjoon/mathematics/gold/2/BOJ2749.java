package baekjoon.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 피보나치 수 3
public class BOJ2749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mod = 1000000;
        int p = mod / 10 * 15;

        int[] fibo = new int[p];
        long n = Long.parseLong(br.readLine()) % p;

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < p; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % mod;
        }

        System.out.println(fibo[(int) n]);
    }
}