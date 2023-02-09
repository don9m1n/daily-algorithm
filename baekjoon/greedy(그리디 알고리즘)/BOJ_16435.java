package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 스네이크버드
public class BOJ_16435 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 과일의 개수
        int L = Integer.parseInt(st.nextToken()); // 스네이크버드의 초기 길이

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] fruits = new int[N];
        for (int i = 0; i < N; i++) {
            fruits[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(fruits);

        for (int i = 0; i < fruits.length; i++) {
            if (L >= fruits[i]) {
                L++;
            }
        }
        System.out.println(L);
    }
}
