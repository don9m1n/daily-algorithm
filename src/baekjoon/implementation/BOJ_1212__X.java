package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 8진수 2진수
public class BOJ_1212__X {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        if(str.equals("0")) {
            System.out.println(0);
            return;
        }

        String[] arr = str.split("");
        int[] octal = new int[arr.length];

        for(int i=0; i<octal.length; i++) {
            octal[i] = Integer.parseInt(arr[i]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<octal.length; i++) {
            int j = 2;
            while (j >= 0) {
                if (octal[i] - (int) Math.pow(2, j) >= 0) {
                    sb.append(1);
                    octal[i] -= (int) Math.pow(2, j);
                } else {
                    sb.append(0);
                }
                j--;
            }
        }
        if(sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        System.out.println(sb.toString());
    }
}
