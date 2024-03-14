package baekjoon.two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 수들의 합 2
public class BOJ2003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 숫자의 개수
        int m = Integer.parseInt(st.nextToken()); // 부분합: 2

        int[] nums = new int[n + 1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 0;
        int sum = 0;
        int cnt = 0;

        while (right <= n) {
            if (sum == m) cnt++;

            if (sum < m) {
                sum += nums[right++];
            } else {
                sum -= nums[left++];
            }
        }
        System.out.println(cnt);
    }
}
