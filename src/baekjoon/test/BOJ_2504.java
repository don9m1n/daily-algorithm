package baekjoon.test.warm_up2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호의 값
public class BOJ_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // (()[[]])([])

        Stack<String> st = new Stack<>();
        boolean isCheck = true;
        for(int i = 0; i <str.length(); i++) {
            String s = str.substring(i, i+1);

            if(s.equals("(")) {
                st.push(")");
                continue;
            }
            if(s.equals("[")) {
                st.push("]");
                continue;
            }

            int num = 0;
            while(true) {
                if(st.isEmpty()) {
                    isCheck = false;
                    break;
                }
                // 스택 맨 위의 요소가 숫자면 더하기
                if(!(st.peek().equals(")") || st.peek().equals("]"))) {
                    num += Integer.parseInt(st.pop());
                }else {
                    if(s.equals(st.peek())) { // 같은 괄호라면!
                        st.pop();
                        int t = (s.equals(")")) ? 2 : 3;

                        if(num == 0) {
                            st.push(String.valueOf(t));
                        }else {
                            st.push(String.valueOf(t * num));
                        }
                    } else {
                        isCheck = false;
                    }
                    break;
                }
            }
            if(!isCheck) break;
        } // 스택 채우기 END!

        int result = 0;
        while(!st.isEmpty()) { // 스택이 비어있지 않으면 계속 반복
            if(!(st.peek().equals(")") || st.peek().equals("]"))) {
                result += Integer.parseInt(st.pop());
            }else {
                isCheck = false;
                break;
            }
        }

        if(isCheck) System.out.println(result);
        else System.out.println(0);
    }
}