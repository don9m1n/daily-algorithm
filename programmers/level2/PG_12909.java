package progammers.level2;

import java.util.Stack;

// 올바른 괄호
public class PG_12909 {
    public static void main(String[] args) {
        System.out.println(solution("(())()"));
        System.out.println(solution("(()("));
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 스택이 비어있고, 닫는 괄호가 가장 먼저 오는 경우에는 올바른 괄호 성립 불가능
            if (stack.isEmpty() && ch == ')') {
                return false;
            }

            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.peek() == '(') {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
