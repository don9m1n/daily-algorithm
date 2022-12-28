package baekjoon.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대공약수와 최소공배수
public class BOJ_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int GCD = findGCD(N, M);
        int LCM = (N * M) / GCD;

        System.out.println(GCD);
        System.out.println(LCM);
    }

    // 유클리드 호제법: GCD(a, b) == GCD(b, a % b) (단, (a >= b))
    // 최소공배수(LCM): (a * b) / GCD
    static int findGCD(int n, int m) {
        while(m > 0) {
            int r = n % m;
            n = m;
            m = r;
        }

        return n;
    }
}