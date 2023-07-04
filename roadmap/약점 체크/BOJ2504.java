package roadmap.part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호의 값
public class BOJ2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String bracket = br.readLine();

        Stack<Character> stack = new Stack<>();
        int sum = 1;
        int result = 0;

        for (int i = 0; i < bracket.length(); i++) {
            char ch = bracket.charAt(i);

            switch (ch) {
                case '(':
                    stack.push(ch);
                    sum *= 2;
                    break;
                case '[':
                    stack.push(ch);
                    sum *= 3;
                    break;
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') {
                        System.out.println(0);
                        return;
                    }
                    if (bracket.charAt(i - 1) == '(') {
                        result += sum;
                    }
                    stack.pop();
                    sum /= 2;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.peek() != '[') {
                        System.out.println(0);
                        return;
                    }
                    if (bracket.charAt(i - 1) == '[') {
                        result += sum;
                    }
                    stack.pop();
                    sum /= 3;
                    break;
            }
        }

        System.out.println(stack.isEmpty() ? result : 0);
    }
}
