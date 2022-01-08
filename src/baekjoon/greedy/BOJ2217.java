package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 로프
public class BOJ2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] rope = new int[n];
        for (int i = 0; i < n; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        /**
         * 각 케이스별 들 수 있는 최대 무게
         * 가장 작은 로프 * n
         */
        Arrays.sort(rope);
        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            max = Math.max(max, rope[i] * (n - i));
        }
        System.out.println(max);
    }
}
