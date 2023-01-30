package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 단어 뒤집기 2
public class BOJ17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        int i = 0;
        while(i < str.length()) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                stack.push(ch);
                i++;
            } else if (ch == ' ') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
                i++;
            } else if (ch == '<') {
                if (!stack.isEmpty()) {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                } else {
                    sb.append(str.substring(i, str.indexOf(">") + 1));
                    i += str.indexOf(">") + 1 - i;
                    str = str.replaceFirst(">", "-");
                }
            }
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);

    }
}
