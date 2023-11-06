package progammers.level2;

import java.util.Stack;

// 괄호 회전하기
public class PG76502 {
    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));
    }

    static int solution(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            String rotate = rotate(s, i);

            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < rotate.length(); j++) {
                char ch = rotate.charAt(j);

                if (stack.isEmpty()) {
                    stack.push(ch);
                } else if (ch == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (ch == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (ch == ')' && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }

            if (stack.isEmpty()) {
                count++;
            }
        }

        return count;
    }

    private static String rotate(String s, int i) {
        StringBuilder sb = new StringBuilder(s);
        sb.delete(0, i);
        sb.append(s, 0, i);

        return sb.toString();
    }
}
