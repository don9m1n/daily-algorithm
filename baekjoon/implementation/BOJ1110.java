package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 더하기 사이클
public class BOJ1110 {

    static int cnt = 0; // 사이클의 길이

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // solution1(n);
        solution2(n);
    }

    private static void solution2(int n) {
        int copy = n;
        do {
            n = ((n % 10) * 10) + (((n % 10) + ((n / 10) % 10)) % 10);
            cnt++;
        } while (n != copy);

        System.out.println(cnt);
    }

    private static void solution1(int n) {
        int copy = n;
        do {
            StringBuilder sb = new StringBuilder();
            int left = copy % 10;
            int right = 0;

            while (copy > 0) {
                right += copy % 10;
                copy /= 10;
            }

            sb.append(left).append(right >= 10 ? right % 10 : right);
            copy = Integer.parseInt(sb.toString());
            cnt++;

        } while (copy != n);
        System.out.println(cnt);
    }
}
