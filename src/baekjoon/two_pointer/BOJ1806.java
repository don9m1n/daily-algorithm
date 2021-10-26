package baekjoon.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 부분합
public class BOJ_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int s = 0;
        int e = 0;
        int prtlSum = 0; // 부분합
        int min = N + 1;

        for(int i = s; i < N; i++) {
            while (prtlSum < S && e < N) { // 부분합이 S보다 작은경우 반복(끝점을 + 하는 경우)
                prtlSum += arr[e++];
            }
            if(prtlSum == S) {
                min = Math.min(min, e-i);
            }
            prtlSum -= arr[i];
        }


        System.out.print(min == N + 1 ? 0 : min);
    }
}
