package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 막대기
public class BOJ17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int count = 1;
        int rightH = stack.pop();
        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (current > rightH) {
                rightH = current;
                count++;
            }
        }

        System.out.println(count);
    }
}
