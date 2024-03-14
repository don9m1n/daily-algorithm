package baekjoon.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 회전 초밥
public class BOJ15961 {

    static int N, d, k, c, result = 0;
    static int[] arr, visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken()); // 접시 수
        d = Integer.parseInt(st.nextToken()); // 초밥 종류
        k = Integer.parseInt(st.nextToken()); // 연속해서 먹는 접시 수
        c = Integer.parseInt(st.nextToken()); // 쿠폰 번호

        arr = new int[N];
        visited = new int[d + 1]; // 먹은 초밥을 체크할 배열 (1 ~ d)
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        slide();
        System.out.println("result = " + result);
    }

    private static int slide() {

        int total = 0;
        for (int i = 0; i < k; i++) {
            if(visited[arr[i]] == 0) total++;
            visited[arr[i]]++;
        }

        return 0;
    }
}
