package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 카드 합체 놀이
public class BOJ15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] cards = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(cards);
            long sum = cards[0] + cards[1];
            cards[0] = sum;
            cards[1] = sum;
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += cards[i];
        }
        System.out.println(sum);
    }
}
