package baekjoon.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 찾기
public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = N; // Counting Prime Number
        for(int i = 0; i < N; i++) {
            // 1은 소수가 아니기 때문에 바로 패스!!
            if(arr[i] == 1) {
                cnt--;
                continue;
            }

            boolean check = true;
            for(int j = 2; j < arr[i]; j++) {
                // 소수가 아님!
                if(j < arr[i] && arr[i] % j == 0) {
                    check = false;
                    break;
                }
            }
            if(!check) cnt--;
        }
        System.out.println(cnt);
    }
}
