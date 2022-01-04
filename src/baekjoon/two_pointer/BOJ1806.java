package baekjoon.two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 부분합
public class BOJ1806 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int right = 0; // 끝점
        int min = n + 1;
        int sum = 0; // 부분합 저장 변수

        for (int left = 0; left < n; left++) {
            while (sum < s && right < n) {
                sum += nums[right++];
            }

            if(sum >= s) {
                min = Math.min(min, right - left);
            }
            sum -= nums[left];
        }

        System.out.println(min == n + 1 ? 0 : min);
    }
}
