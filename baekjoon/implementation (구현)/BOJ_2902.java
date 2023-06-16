package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// KMP는 왜 KMP일까?
public class BOJ_2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("-");

        StringBuilder sb = new StringBuilder();

        for(String str : arr) {
            sb.append(str.charAt(0));
        }

        System.out.println(sb.toString());
    }
}