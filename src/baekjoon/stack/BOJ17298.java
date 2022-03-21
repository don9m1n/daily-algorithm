package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 오큰수
public class BOJ17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                nums[stack.pop()] = nums[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            nums[stack.pop()] = -1;
        }

        StringBuilder result = new StringBuilder();
        for (int num : nums) {
            result.append(num).append(" ");
        }
        System.out.println(result);
    }
}