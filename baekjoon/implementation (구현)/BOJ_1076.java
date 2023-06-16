package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 저항
public class BOJ_1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] multiple = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

        String[] colors = new String[3];
        for(int i=0; i<colors.length; i++) {
            colors[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<colors.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(colors[i].equals(arr[j])) {
                    if(i == 2) {
                        System.out.println((long)Integer.parseInt(sb.toString()) * multiple[j]);
                        break;
                    }
                    sb.append(j);
                }
            }
        }
    }
}