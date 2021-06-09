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

        int[] arr = new int[N-1];
        for(int i = 0; i < N-1; i++) {
            arr[i] = i + 2;
        }

        int cnt = 0; // Counting variable
        int result = 0;
        while(cnt != K) {
            int min = 0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i] != 1) {
                    min = arr[i];
                    break;
                }
            }

            for(int i=0; i<arr.length; i++) {
                if(arr[i] != 1 && (arr[i] == min || arr[i] % min == 0)) {
                    result = arr[i];
                    arr[i] = 1;
                    cnt++;
                }
            }
            Arrays.sort(arr);
        }
        System.out.println(result);
    }
}
