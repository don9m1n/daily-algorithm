package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 세로읽기
public class BOJ_10789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[5];
        int max = 0;
        for(int i=0; i<arr.length; i++) {
            arr[i] = br.readLine();
            if(arr[i].length() > max) {
                max = arr[i].length();
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i].length() < max) {
                while(arr[i].length() < max) {
                    arr[i] += "!";
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<max; i++) {
            for(int j=0; j<5; j++) {
                if(arr[j].charAt(i) == '!') {
                    continue;
                }
                sb.append(arr[j].charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}