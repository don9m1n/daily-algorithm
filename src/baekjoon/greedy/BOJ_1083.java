package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 소트
// FEEDBACK: 버블정렬 사용해서 풀 수 있는 문제
public class BOJ_1083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long S = Integer.parseInt(br.readLine()); // 정렬 횟수

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int i = 0;
        while(S > 0) {
            if(i == arr.length-1) break;
            if(arr[i+1] > arr[i]) {
                long temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                S--;
            }
            i++;
        }

        for(long l : arr) {
            System.out.print(l + " ");
        }
    }
}
