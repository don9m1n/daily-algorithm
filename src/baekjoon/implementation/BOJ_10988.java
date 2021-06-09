package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린드롬인지 확인하기
public class BOJ_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        String[] arr_reverse = new String[arr.length];

        boolean check = isCheck(arr, createArr(arr, arr_reverse));
        int result = result(check);
        System.out.println(result);
    }

    // Create Reverse Array!
    static String[] createArr(String[] original, String[] reverse) {
        for(int i = original.length-1, j = 0; i >= 0; i--, j++) {
            reverse[j] = original[i];
        }
        return reverse;
    }

    // Check Palindrome!
    static boolean isCheck(String[] original, String[] reverse){
        boolean check = false;
        for(int i = 0; i < original.length; i++) {
            if(original[i].equals(reverse[i])) {
                check = true;
            }else {
                check = false;
                break;
            }
        }
        return check;
    }

    // Print Result!
    static int result(boolean check){
        return !check ? 0 : 1;
    }
}
