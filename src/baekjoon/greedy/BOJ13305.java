package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 주유소
 * HINT! 가격을 내림차순으로 정렬해서 계산하자!
 */
public class BOJ13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 도시의 개수


        int[] price = new int[n]; // 도시별 기름 가격
        int[] dist = new int[n - 1]; // 도시 간의 거리

        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 도시 간 거리
        for (int i = 0; i < n - 1; i++) {
            dist[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        long result = 0; // 최소 비용
        long min = price[0];
        for (int i = 0; i < n - 1; i++) {
            if (price[i] < min) {
                min = price[i];
            }

            result += min * dist[i];
        }

        System.out.println(result);

    }
}