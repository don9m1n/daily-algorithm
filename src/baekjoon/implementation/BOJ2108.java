package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 통계학
public class BOJ2108 {

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        String print = print(nums);
        System.out.println(print);
    }

    private static String print(int[] nums) {
        StringBuilder sb = new StringBuilder();
        sb.append(avg(nums)).append("\n")
                .append(median(nums)).append("\n")
                .append(mode(nums)).append("\n")
                .append(range(nums));

        return sb.toString();
    }

    // 범위
    private static int range(int[] nums) {
        Arrays.sort(nums);
        return nums[n - 1] - nums[0];
    }

    // 최빈값 ( -4000 <= num <= 4000 )
    private static int mode(int[] nums) {
        int[] count = new int[8002];
        for (int i = 0; i < nums.length; i++) {
            count[4000 + nums[i]]++;
        }

        int max = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if(count[i] == 0) continue;
            if(count[i] > max) {
                max = count[i];
            }
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i] == 0) continue;
            if(count[i] == max) {
                list.add(i - 4000);
            }
        }
        return list.size() == 1 ? list.get(0) : list.get(1);
    }

    // 중앙값
    private static int median(int[] nums) {
        Arrays.sort(nums);
        return nums[n / 2];
    }

    // 산술 평균
    private static int avg(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return Math.round((sum / (float) n));
    }
}
