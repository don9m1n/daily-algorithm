package baekjoon.greedy.solve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// 크게 만들기
public class BOJ_2812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken()); // 숫자 자릿수
        int K = Integer.parseInt(st.nextToken()); // 지울 숫자의 개수

        String num = br.readLine();

        Stack<Character> stack = new Stack<>();
        // 첫 번째 숫자는 넣고 시작
        stack.push(num.charAt(0));
        int cnt = 0;
        boolean flag = true;

        // isEmpty(): 스택이 비어있으면 true, 아니면 false
        for(int i = 1; i < num.length(); i++) {
            char ch = num.charAt(i);

            // 숫자를 비교하는 while문
            while(!stack.isEmpty() && flag) {
                if(cnt == K) {
                    flag = false;
                    break;
                }

                if(stack.peek() < ch) {
                    stack.pop();
                    cnt++;
                } else if(stack.peek() >= ch) {
                    break;
                }
            }
            stack.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        // 반복문을 돌았지만 제거해야할 숫자 개수를 충족하지 못했을 경우
        if(cnt < K) {
            int gap = K - cnt;
            for(int i = 0; i < stack.size() - gap; i++) {
                sb.append(stack.get(i));
            }
        }else {
            for(int i = 0; i < stack.size(); i++) {
                sb.append(stack.get(i));
            }
        }
        System.out.println(sb.toString());
    }
}