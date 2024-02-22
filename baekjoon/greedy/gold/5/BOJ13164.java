package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 행복 유치원
public class BOJ13164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] child = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            child[i] = Integer.parseInt(st.nextToken());
        }

        int[] diff = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            diff[i] = child[i + 1] - child[i];
        }

        Arrays.sort(diff);
        int sum = 0;
        for (int i = 0; i < n - k; i++) {
            sum += diff[i];
        }

        System.out.println(sum);
    }
}
