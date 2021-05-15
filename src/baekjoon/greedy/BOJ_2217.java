package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

// 로프
public class BOJ_2217_X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] w = new int[N];

        for(int i=0; i<N; i++) {
            w[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(w);

        int max = 0;
        for(int i=0; i<w.length; i++) {
            if(w[i] * (N-i) > max) {
                max = w[i] * (N-i);
            }
        }
        System.out.println(max);
    }
}