package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팩토리얼
public class BOJ10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        factorial1(n); // 반복문
        int result = factorial2(n); // 재귀

    }

    private static int factorial2(int n) {
        if(n < 1) {
            return 1;
        }

        return n * factorial2(n - 1);
    }

    private static void factorial1(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
