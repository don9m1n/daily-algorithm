package baekjoon.sieve_of_eratosthenes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 구하기
public class BOJ1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= n; i++) {
            if (!prime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = m; i < prime.length; i++) {
            if(!prime[i]) System.out.println(i);
        }


    }
}
