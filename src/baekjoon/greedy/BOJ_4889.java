package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 안정적인 문자열
// 괄호 문제가 나오면 Stack 생각 ㄱㄱ!
public class BOJ_4889 {
    // stack 변수 선언
    static Stack<Character> stack = new Stack<Character>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 1; // 테스트 케이스 번호!

        while (true) {
            String input = br.readLine();
            if (input.charAt(0) == '-') break;

            int cnt = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == '{') {
                    stack.push(c);
                } else {
                    System.out.println(c);
                    if (stack.size() != 0 && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push('}');
                    }
                }
            }

            if (stack.size() != 0) {
                while (!stack.isEmpty()) {
                    char c1 = stack.pop();
                    char c2 = stack.pop();

                    if (c1 == c2) cnt++;
                    else cnt += 2;
                }
            }
            System.out.println(T + ". " + cnt);
            T++;
        }
    }
}
