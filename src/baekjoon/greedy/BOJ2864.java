package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 5와 6의 차이
public class BOJ2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] nums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = changeMin(nums);
        int max = changeMax(nums);
        System.out.println(min + " " + max);
    }

    // 5을 6으로!!
    private static int changeMax(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int idx = 1;
            while (num > 0) {
                if (num % 10 == 5) {
                    sum += 6 * idx;
                } else {
                    sum += (num % 10) * idx;
                }
                num /= 10;
                idx *= 10;
            }
        }
        return sum;
    }

    private static int changeMin(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int idx = 1;
            while (num > 0) {
                if (num % 10 == 6) {
                    sum += 5 * idx;
                } else {
                    sum += (num % 10) * idx;
                }
                num /= 10;
                idx *= 10;
            }
        }
        return sum;
    }
}
