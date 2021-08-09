package baekjoon.test.warm_up2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호
public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String str = br.readLine();
            Stack<Character> st = new Stack<>();

            for(int j = 0; j < str.length(); j++) {
                if(st.isEmpty() && str.charAt(j) == ')') {
                    st.push(str.charAt(j));
                    break;
                }

                if (str.charAt(j) == '(') {
                    st.push(str.charAt(j));
                } else if (str.charAt(j) == ')') {
                    st.pop();
                }
            }

            if(st.isEmpty()) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
