package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 게임을 만든 동준이
public class BOJ2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = score.length - 1; i > 0 ; i--) {
            if (score[i - 1] >= score[i]) {
                int diff = score[i - 1] - score[i] + 1;
                count += diff;
                score[i - 1] -= diff;
            }
        }

        System.out.println(count);
    }
}
