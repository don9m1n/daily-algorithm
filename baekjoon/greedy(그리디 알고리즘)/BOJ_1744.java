package baekjoon.greedy.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 수 묶기
public class BOJ_1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);
        int left = 0;
        int right = N - 1;
        int sum = 0;

        // 0, 음수일 경우 처리
        while(left < right) {
            if(nums[left] < 1 && nums[left + 1] < 1) {
                sum += nums[left] * nums[left + 1];
            }else {
                break;
            }
            left += 2;
        }

        // 양수일 경우 처리
        while(right > 0) {
            // 둘 중 하나가 1이면 더한 값이 더 크기 때문에 조건 추가
            if(nums[right] > 1 && nums[right - 1] > 1) {
                sum += nums[right] * nums[right - 1];
            }else {
                break;
            }
            right -= 2;
        }

        // 남은 값들 더해주기
        while(right >= left) {
            sum += nums[right];
            right--;
        }
        System.out.println(sum);
    }
}