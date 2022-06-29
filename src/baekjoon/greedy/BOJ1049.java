package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 기타줄
public class BOJ1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int min = Integer.MAX_VALUE;

        int price1 = Integer.MAX_VALUE;
        int price2 = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            price1 = Math.min(price1, Integer.parseInt(st.nextToken()));
            price2 = Math.min(price2, Integer.parseInt(st.nextToken()));
        }

        int p1 = (n%6==0) ? (n / 6) * price1 : ((n / 6) + 1) * price1;
        int p2 = ((n / 6) * price1) + ((n % 6) * price2);
        int p3 = n * price2;

        min = Math.min(p1, Math.min(p2, p3));
        System.out.println(min);
    }
}
