package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린드롬인지 확인하기
public class BOJ_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        String[] arr_copy = new String[arr.length];

        for(int i = arr.length-1, j = 0; i >= 0; i--, j++) {
            arr_copy[j] = arr[i];
        }

        boolean check = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(arr_copy[i])) {
                check = true;
            }else {
                check = false;
                break;
            }
        }

        if(!check) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
