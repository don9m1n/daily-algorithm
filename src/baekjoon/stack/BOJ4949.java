package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 균형잡힌 세상
public class BOJ4949 {

    static Map<Character, Character> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map.put(']', '[');
        map.put(')', '(');

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '(' || ch == ')' || ch == '[' || ch == ']') {
                    sb.append(ch);
                }
            }

            System.out.println(validateBrackets(sb)); // 스택
        }
    }

    /**
     *  스택을 이용한 풀이 방법 !!
     *  괄호를 판별하는 조건
     *  1. 스택이 비어있지않고 닫는 괄호가 나왔을때 map.get()이 stack.peek()의 값고 같으면 pop() 아니라면 push()
     *  2. 여는 괄호가 나오는 경우에는 스택에 바로 push()!!
     */
    private static String validateBrackets(StringBuilder sb) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < sb.length(); i++) {
            if (!stack.isEmpty() && (sb.charAt(i) == ']' || sb.charAt(i) == ')')) {
                if (map.get(sb.charAt(i)) == stack.peek()) {
                    stack.pop();
                }else {
                    stack.push(sb.charAt(i));
                }
            } else {
                stack.push(sb.charAt(i));
            }
        }
        return (stack.isEmpty()) ? "yes" : "no";
    }
}
