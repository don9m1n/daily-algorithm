package baekjoon.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

// 회전 초밥
public class BOJ15961 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 접시 수
        int d = Integer.parseInt(st.nextToken()); // 초밥 종류
        int k = Integer.parseInt(st.nextToken()); // 연속해서 먹는 접시 수
        int c = Integer.parseInt(st.nextToken()); // 쿠폰 번호

        int maxEat = 0; // 최대로 먹을 수 있는 초밥 접시의 개수
        int[] rice = new int[N];
        for (int i = 0; i < N; i++) {
            rice[i] = Integer.parseInt(br.readLine());
        }

        int i = 0, j = 0;
        Set<Integer> set = new HashSet<>();

    }
}
