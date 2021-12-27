package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 스택 수열
public class BOJ1874 {

    static BufferedReader br;
    static int n;
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        System.out.println(equalSign());
    }

    private static String equalSign() throws IOException {
        StringBuilder sb = new StringBuilder();

        int start = 1;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine()); // 4 -> 3 -> 6 -> 8 -> 7 -> 5 -> 2 -> 1

            while(start <= num) {
                stack.push(start);
                sb.append("+").append("\n");
                start++;
            }

            if(stack.peek() > num) {
                return "NO";
            }else {
                stack.pop();
                sb.append("-").append("\n");
            }
        }
        return sb.toString();
    }
}