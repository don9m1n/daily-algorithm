package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린드롬수
public class BOJ1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            System.out.println(isPalindrome(n) ? "yes" : "no");
        }
    }

    private static boolean isPalindrome(int n) {
        int num = n;

        int sum = 0;
        while (num > 0) {
            sum = (sum * 10) + (num % 10);
            num /= 10;
        }

        return sum == n;
    }
}
