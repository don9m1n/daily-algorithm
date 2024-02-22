package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 통나무 건너뛰기
public class BOJ11497 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int left = 0;
            int right = n - 1;

            int[] result = new int[n];
            for (int j = 0; j < result.length; j++) {
                if (j % 2 == 0) {
                    result[left++] = arr[j];
                } else {
                    result[right--] = arr[j];
                }
            }

            int max = Integer.MIN_VALUE;
            for (int j = 0; j < n - 1; j++) {
                max = Math.max(max, Math.abs(result[j] - result[j + 1]));
            }

            System.out.println(max);
        }
    }
}
