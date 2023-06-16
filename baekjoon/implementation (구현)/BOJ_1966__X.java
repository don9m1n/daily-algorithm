package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 프린터 큐
public class BOJ_1966__X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); //
            int M = Integer.parseInt(st.nextToken()); // 문서의 위치

            int[] level = new int[N];
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                level[i] = Integer.parseInt(st.nextToken());
            }

        }
    }
}
