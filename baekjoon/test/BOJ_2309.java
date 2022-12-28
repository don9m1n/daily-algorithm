package baekjoon.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 일곱 난쟁이
public class BOJ_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int sum = 0;

        for(int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr); // 배열 오름차순 정렬
        for(int i = 0; i < 9; i++) {
            for(int j = i + 1; j < 9; j++) {
                if(sum - arr[i] - arr[j] == 100) {
                    for(int k = 0; k < 9; k++) {
                        if(k == i || k == j) continue;
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }
}
