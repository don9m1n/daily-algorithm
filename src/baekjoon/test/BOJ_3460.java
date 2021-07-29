package baekjoon.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 이진수
public class BOJ_3460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String[] bianry = new String[T];

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            StringBuilder tmp = new StringBuilder();

            while(N != 1) {
                tmp.append(N % 2);
                N /= 2;
            }
            tmp.append(N);
            bianry[i] = tmp.toString();
        }

        for(String str : bianry) {
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '1') {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
