package baekjoon.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 소가 길을 건너간 이유 5
public class BOJ14465 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 횡단보도의 개수
        int K = Integer.parseInt(st.nextToken()); // 정상적으로 작동해야하는 신호등의 개수
        int B = Integer.parseInt(st.nextToken()); // 고장난 신호등의 개수

        boolean[] isBroken = new boolean[N + 1]; // 신호등 개수

        // 정상: false, 고장: true
        for (int i = 0; i < B; i++) {
            isBroken[Integer.parseInt(br.readLine())] = true;
        }

        System.out.println(Arrays.toString(isBroken));

        // int s = 1; // 시작 지점
        int cnt = 0;
        int s = 1;
        int min = K; // 최소값

        for (int e = 1; e < N; e++) {
            if(isBroken[e]) cnt++;

        }

        System.out.println("min = " + min);
    }
}