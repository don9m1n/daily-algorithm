package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 파보나치 수
public class BOJ_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int num1=0;
        int num2=1;
        int num3=0;

        if(N == 0) {
            System.out.println(0);
            return;
        }else if(N == 1) {
            System.out.println(1);
            return;
        }

        for(int i=1; i<N; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(num3);
    }
}
