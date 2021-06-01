package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 제로
public class BOJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<N; i++) {
            int K = Integer.parseInt(br.readLine());

            if(K == 0) {
                st.pop();
            }else {
                st.push(K);
            }
        }

        int sum = 0;
        for(int n : st) {
            sum += n;
        }
        System.out.println(sum);
    }
}
