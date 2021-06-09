package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2960 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        boolean[] primeNum = new boolean[N+1];

        int cnt = 0;

        for(int i = 2; i <= N; i++) {
            primeNum[i] = true;
        }

        for(int i = 2; i <= N; i++) {
            for(int j = i; j <= N; j += i) {
                // 해당 요소가 false인 경우 pass
                if(!primeNum[j]) {
                    continue;
                }

                // true인 경우 false로 상태 변경
                primeNum[j] = false;
                cnt++;
                if(cnt == K) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
