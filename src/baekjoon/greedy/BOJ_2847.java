package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 게임을 만든 동준이
public class BOJ_2847 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];

        for(int i=0; i<N; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for(int i=0; i<score.length-1; i++) {
            if(score[i] < score[i+1]) {
                continue;
            }

            while(score[i] >= score[i+1]) {
                score[i] -= 1;
                cnt++;
            }
            System.out.println(Arrays.toString(score));
            System.out.println(cnt);
        }
    }
}
