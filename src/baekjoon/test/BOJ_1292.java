package baekjoon.test.warm_up1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 쉽게 푸는 문제 ...?
public class BOJ_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] arr = new int[1001];
        int count = 0;

        for(int i = 1; i <= 1000; i++) {
            for(int j = 0; j < i; j++) {
                if(count == 1001) break;
                arr[count] = i;
                count++;
            }
        }

        int sum = 0;
        for(int i = A - 1; i < B; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
