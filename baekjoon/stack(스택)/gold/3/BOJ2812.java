package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 크게 만들기
public class BOJ2812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int num = input.charAt(i) - 48;

            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && k > 0) {
                    if (stack.peek() < num) {
                        stack.pop();
                        k--;
                    } else {
                        break;
                    }
                }
            }
            stack.push(num);
        }

        if (k > 0) {
            while (k > 0) {
                stack.pop();
                k--;
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.reverse());
    }
}
