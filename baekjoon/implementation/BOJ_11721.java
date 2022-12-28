package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 열 개씩 끊어 출력하기
public class BOJ_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i));
            if(i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
