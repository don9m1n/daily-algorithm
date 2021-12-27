package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호
public class BOJ9012 {
    static int t;
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine()); // test case

        for (int i = 0; i < t; i++) {
            System.out.println(vps2());
        }
    }

    private static String vps2() throws IOException {

        Stack<Character> stack = new Stack<>();
        String ps = br.readLine();

        for (int i = 0; i < ps.length(); i++) {
            char c = ps.charAt(i);

            if(c == '(') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return "NO";
            } else {
                stack.pop();
            }
        }

        if(stack.isEmpty()) {
            return "YES";
        }else {
            return "NO";
        }
    }

    private static void vps1() throws IOException {

        for (int i = 0; i < t; i++) {
            Stack<Character> stack = new Stack<>();
            String ps = br.readLine();
            stack.push(ps.charAt(0));

            for (int j = 1; j < ps.length(); j++) {
                char ch = ps.charAt(j);

                if(stack.isEmpty() || stack.peek() == ')' || stack.peek() == '(' && ch == '(') {
                    stack.push(ch);
                } else if(stack.peek() == '(' && ch == ')') {
                    stack.pop();
                }
            }

            if(stack.isEmpty()) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
