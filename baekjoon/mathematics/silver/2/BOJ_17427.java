package baekjoon.mathmatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 약수의 합 2
public class BOJ_17427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * (n / i);
        }

        System.out.println(sum);
    }
}
