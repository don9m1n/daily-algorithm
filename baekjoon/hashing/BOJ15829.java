package baekjoon.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Hashing
public class BOJ15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int r = 31;
        int M = 1234567891;

        long pow = 1;
        long sum = 0L;

        String str = br.readLine();
        /*
            모듈러 연산의 특징
            - (A + B) Mod M == ((A Mod M) + (B Mod M)) Mod M;
         */
        for (int i = 0; i < L; i++) {
            sum += (((str.charAt(i) - 'a') + 1) * pow) % M;
            pow = pow * r % M; // 다음에 곱할 r을 계산
        }

        System.out.println(sum % M);
    }
}