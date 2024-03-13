package baekjoon.prefix_sum.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수열
public class BOJ_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] temp = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
        }

        int[] prefixSum = new int[n - k + 2];
        for (int i = 1; i <= k; i++) {
            prefixSum[1] += temp[i];
        }

        for (int i = 2; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] - temp[i - 1] + temp[i - 1 + k];
        }

        System.out.println(Arrays.toString(prefixSum));
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < prefixSum.length; i++) {
            max = Math.max(max, prefixSum[i]);
        }

        System.out.println(max);
    }
}
