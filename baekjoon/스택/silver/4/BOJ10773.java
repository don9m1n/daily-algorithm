package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 재로
public class BOJ10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int money = Integer.parseInt(br.readLine());

            if(money != 0) {
                sum += money;
                stack.push(money);
            }else {
                sum -= stack.pop();
            }
        }
        System.out.println(sum);
    }
}
