package baekjoon.bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소수&팰린드롬
public class BOJ1747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (true) {
            if (isPrimeNumber(n) && palindrome(n)) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }

    // 팰린드롬 판별
    private static boolean palindrome(int n) {
        int num = n;
        int reverse = 0;

        while (num > 0) {
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }

        return reverse == n;
    }

    // 소수 판별
    private static boolean isPrimeNumber(int n) {
        if(n == 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
